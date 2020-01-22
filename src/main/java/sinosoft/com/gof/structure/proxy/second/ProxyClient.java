package sinosoft.com.gof.structure.proxy.second;

import java.lang.reflect.Proxy;

public class ProxyClient {

	
	public static void main(String[] args) {
		ParentMingXingI mingxing = new ZhouJL();
		DProxy handler = new DProxy(mingxing);
		ParentMingXingI mx = (ParentMingXingI)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				mingxing.getClass().getInterfaces(), 
				handler);
		mx.say();
		mx.sing();
	}
}
