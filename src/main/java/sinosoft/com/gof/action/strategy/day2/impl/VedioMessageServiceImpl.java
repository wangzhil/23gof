package sinosoft.com.gof.action.strategy.day2.impl;

import org.springframework.stereotype.Service;

import sinosoft.com.gof.action.strategy.day2.Message;
import sinosoft.com.gof.action.strategy.day2.MessageSerciceI;
import sinosoft.com.gof.action.strategy.day2.MsgHandler;
import sinosoft.com.gof.action.strategy.day2.MsgType;

@MsgHandler(MsgType.VEDIO)
@Service(value = "vedioServiceImp")
public class VedioMessageServiceImpl implements MessageSerciceI {

	@Override
	public void dealMessageService(Message message) {
		System.err.println("处理VEDIO信息:type :"+message.getMsg()+",内容："+message.getContent());
	}

}
