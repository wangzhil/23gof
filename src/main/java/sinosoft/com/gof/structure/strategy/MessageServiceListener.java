package sinosoft.com.gof.structure.strategy;

import java.util.Map;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Map<String, Object> beans = event.getApplicationContext().getBeansWithAnnotation(MsgHandler.class);
		MessageServiceContext context = event.getApplicationContext().getBean(MessageServiceContext.class);
		beans.forEach((name, bean) -> {
			context.putMessageService(bean.getClass().getAnnotation(MsgHandler.class).value().code, (MessageServiceI)bean);
		});
	}

}
