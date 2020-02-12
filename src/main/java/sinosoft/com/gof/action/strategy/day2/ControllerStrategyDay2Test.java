package sinosoft.com.gof.action.strategy.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStrategyDay2Test {

	@Autowired
	private MessageServiceContext context;
	
	@GetMapping("/MessageService")
	public void getMessage(@RequestParam("name") String name,@RequestParam("content")  String content) {
		Message message = new Message(name, content);
		MessageSerciceI messageServiceI = context.getMessageService(name);
		messageServiceI.dealMessageService(message);
	}
	
}
