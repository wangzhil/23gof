package sinosoft.com.gof.creation.factory.method;

public class VolvoCarFactory implements CarFactory {

	@Override
	public CarMethod createCarFactory() {
		
		return new VolvoCar();
	}

	
}
