package sinosoft.com.gof.creation.abstractfactory;

public class Clinet {

	public static void main(String[] args) {
		new LuxuryCarFactory().createEngine().start();
		new LuxuryCarFactory().createEngine().run();
		new LuxuryCarFactory().createSeat().message();
		new LuxuryCarFactory().createTyre().revole();
	}
}
