package sinosoft.com.gof.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
    private Object mingxing;
	public DynamicProxy(Object MingXing) {
		this.mingxing = MingXing;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		Object object = null;
		if("sing".equals(method.getName())){
			System.out.println("唱歌前要说话.");
			object = method.invoke(mingxing, args);
			System.out.println("唱歌后Jielun离场.");
		}
		return object;
	}
}
