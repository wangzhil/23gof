package sinosoft.com.gof.structure.strategy;

import java.util.HashMap;

import org.springframework.stereotype.Component;

/**
 * @date 2020/1/22
 * @author wangzl
 * @description: 提供获取msgHandler标记的实现类和init实现类逻辑 
 * 
 */
@Component
public class MessageServiceContext {

	private HashMap<String, MessageServiceI> map = new HashMap<String, MessageServiceI>();
	
	public void putMessageService(String code, MessageServiceI message) {
		map.put(code, message);
	}
	public MessageServiceI getMessageService(String code) {
		return map.get(code);
	}

	
}
