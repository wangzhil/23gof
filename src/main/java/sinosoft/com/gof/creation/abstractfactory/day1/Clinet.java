package sinosoft.com.gof.creation.abstractfactory.day1;

public class Clinet {

	public static void main(String[] args) {
		CarFactory fa = new LowerCarFactory();
		fa.createEngine().start();
		fa.createEngine().run();
		fa.createSeat().message();
		fa.createTyre().revole();
	}
}
