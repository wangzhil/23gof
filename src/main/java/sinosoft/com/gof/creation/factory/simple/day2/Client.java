package sinosoft.com.gof.creation.factory.simple.day2;

public class Client {

	public static void main(String[] args) {
		new CarFactoryDay2().getCarFactory("奥迪").run();
		new CarFactoryDay2().getCarFactory("沃尔沃").run();
	}
}
