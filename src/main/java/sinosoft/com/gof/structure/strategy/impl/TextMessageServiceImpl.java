package sinosoft.com.gof.structure.strategy.impl;

import org.springframework.stereotype.Service;

import sinosoft.com.gof.structure.strategy.MessageInfo;
import sinosoft.com.gof.structure.strategy.MessageServiceI;
import sinosoft.com.gof.structure.strategy.MsgHandler;
import sinosoft.com.gof.structure.strategy.MsgType;

/**
 * @date 2020/1/22
 * @author wangzl
 *
 */
@MsgHandler(MsgType.TEXT)
@Service
public class TextMessageServiceImpl implements MessageServiceI {

	@Override
	public void dealMessage(MessageInfo messageInfo) {
		System.err.println("类型："+ messageInfo.getMsgType() + ",消息:"+messageInfo.getConntent());

	}

}
