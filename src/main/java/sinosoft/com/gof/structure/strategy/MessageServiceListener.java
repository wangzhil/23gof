package sinosoft.com.gof.structure.strategy;

import java.util.Map;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// 监听获取MsgHandler注解的所有bean对象
		Map<String, Object> beans = event.getApplicationContext().getBeansWithAnnotation(MsgHandler.class);
		// 获取当前提供取和存bean的context对象
		MessageServiceContext context = event.getApplicationContext().getBean(MessageServiceContext.class);
		// 循环将MsgHandler注解对象放入context
		beans.forEach((name, bean) -> {
			context.putMessageService(bean.getClass().getAnnotation(MsgHandler.class).value().code, (MessageServiceI)bean);
		});
	}

}
