package sinosoft.com.structure.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		ParentMX mingx = new JieLun();
		DynamicProxy handler = new DynamicProxy(mingx);
		ParentMX xxx  = (ParentMX)Proxy.newProxyInstance(mingx.getClass().getClassLoader(), mingx.getClass().getInterfaces(), handler);
		xxx.sing();
	}
}
