package sinosoft.com.gof.creation.abstractfactory.day2;

public class Clinet {

	public static void main(String[] args) {
		LuxuryFactoryDay2 f = new LuxuryFactoryDay2();
		f.createEngine().start();
		f.createEngine().run();
		f.createSeat().message();
	}
}
