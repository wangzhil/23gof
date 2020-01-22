package sinosoft.com.gof.structure.proxy.second;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DProxy implements InvocationHandler {
	
	Object obj;

	public DProxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		if ("sing".equals(method.getName())){
			System.out.println("唱歌前的交流!!!");
			object = method.invoke(obj, args);
			System.out.println("唱歌后离场!!!");
		} else {
			object = method.invoke(obj, args);
		}
		return object;
	}
	
	
	

}
