package sinosoft.com.gof.structure.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/strategy")
public class ControllerTest {

	@Autowired
	private MessageServiceContext messageServiceContext;
	
	@GetMapping("/message")
	public void getMessage(@RequestParam("msgType") String msgType,@RequestParam("content") String content) {
		MessageInfo mess = new MessageInfo(msgType, content);
		MessageServiceI message = messageServiceContext.getMessageService(mess.getMsgType());
		message.dealMessage(mess);
	}
}
