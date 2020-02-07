package sinosoft.com.gof.creation.factory.method;

public class AudiCarFactory implements CarFactory {

	@Override
	public CarMethod createCarFactory() {
		// TODO Auto-generated method stub
		return new AudiCar();
	}

}
