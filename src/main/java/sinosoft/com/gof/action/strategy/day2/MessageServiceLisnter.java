package sinosoft.com.gof.action.strategy.day2;

import java.util.Map;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceLisnter implements ApplicationListener<ContextRefreshedEvent>{

	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Map<String, Object> beans = event.getApplicationContext().getBeansWithAnnotation(MsgHandler.class);
		MessageServiceContext context = event.getApplicationContext().getBean(MessageServiceContext.class);
		beans.forEach((name, bean) -> {
			String code = bean.getClass().getAnnotation(MsgHandler.class).value().code;
			context.putMessageService(code, (MessageSerciceI)bean);
		});
		
	}

}
