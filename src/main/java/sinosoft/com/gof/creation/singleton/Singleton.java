package sinosoft.com.gof.creation.singleton;

import org.springframework.util.Assert;

public class Singleton {

	// 1. 静态内部类
	/*private static class Singleton1 {
		private static Singleton instance = new Singleton();
	}
	private Singleton() {}
	public Singleton getSingleton() {
		
	    return Singleton1.instance;
	}*/
	
	// 饿汉式
	/*private Singleton (){}
	private Singleton instance = new Singleton();
	public Singleton getInstance() {
		return instance;
	}*/
	
	// 懒汉式
	private Singleton instance = null;
	private Singleton() {
		// 防止反射获取对象
		Assert.isNull(instance, "对象为单例获取失败!");
	}
	public synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
