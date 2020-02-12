package sinosoft.com.gof.action.strategy.day2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component(value = "serviceContext")
public class MessageServiceContext {

	public Map<String, MessageSerciceI> map = new HashMap<String, MessageSerciceI>();
	
	public void putMessageService(String msg, MessageSerciceI message) {
		map.put(msg, message);
	}
	public MessageSerciceI getMessageService(String msgType) {
		return map.get(msgType);
	}
}
