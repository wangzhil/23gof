package sinosoft.com.gof.creation.factory.method;

public class Client {

	public static void main(String[] args) {
		CarFactory audiFactory = new AudiCarFactory();
		audiFactory.createCarFactory().running();
		audiFactory.createCarFactory().driving();
		CarFactory volvo = new VolvoCarFactory();
		volvo.createCarFactory().running();
		volvo.createCarFactory().driving();
		
	}
}
