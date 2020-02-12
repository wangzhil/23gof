package sinosoft.com.gof.creation.factory.method.day2;

public class Client {

	public static void main(String[] args) {
		new AudiCarMFactoryDay2().createCarInstance().run();
		new AudiCarMFactoryDay2().createCarInstance().start();
	}
}
