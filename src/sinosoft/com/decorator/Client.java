package sinosoft.com.decorator;

/**
 * 装饰模式
 * @author devel
 *
 */
public class Client {
	public static void main(String[] args) {
		//装饰一个功能
		System.out.println("装饰一个功能......");
		new SwimCar(new Car()).move();
		System.out.println("装饰俩个功能......");
		new SwimCar(new FlyCar(new Car())).move();
	}
}
