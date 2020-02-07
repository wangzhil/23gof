package sinosoft.com.gof.creation.factory.simple;

public class SimpleFactory {

	public Car getCarFactory(String name) {
		Car car = null;
		if ("宝马".equals(name)) {
			car = new BaomaCar();
		} else if ("奥迪".equals(name)) {
			car = new AodiCar();
		} else {
			System.out.println("出错了！");
		}
		return car;
	}
	
	public static void main(String[] args) {
		new SimpleFactory().getCarFactory("宝马").running();
		new SimpleFactory().getCarFactory("奥迪").running();
	}
}
