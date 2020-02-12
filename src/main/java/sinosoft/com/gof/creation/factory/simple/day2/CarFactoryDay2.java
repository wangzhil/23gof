package sinosoft.com.gof.creation.factory.simple.day2;

public class CarFactoryDay2 {

	public CarDay2 getCarFactory(String name) {
		CarDay2 car = null; 
		if ("奥迪".equals(name)) {
			car = new AudiCarDay2();
		} else if ("沃尔沃".equals(name)) {
			car = new VolvoCarDay2();
		} else {
			throw new RuntimeException("没有定义车型!");
		}
		return car;
	}
}
