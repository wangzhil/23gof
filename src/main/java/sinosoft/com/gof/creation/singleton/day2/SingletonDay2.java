package sinosoft.com.gof.creation.singleton.day2;


import org.springframework.util.Assert;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 单例模式主要思想就是构造器私有化，提供对外方法调用
 * @author wangzl
 *
 */
@Data
public class SingletonDay2 {

	/*private SingletonDay2 instance = new SingletonDay2();
	
	public SingletonDay2 getInstance() {
		return instance;
	}*/
	
	// 防止反射获取对象
	/*private SingletonDay2 instance = null;
	private SingletonDay2 (){
		Assert.isNull(instance, "对象为单例，获取失败!");
	}
	public synchronized SingletonDay2 getInstance() {
		if (instance == null) {
			instance = new SingletonDay2();
		}
		return instance;
	}*/
	
	private static class SingletonStatic {
		private static SingletonDay2 instance = new SingletonDay2();
	}
	
	public SingletonDay2 getInstance() {
		return SingletonStatic.instance;
	}
}
