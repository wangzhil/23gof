package sinosoft.com.gof.creation.abstractfactory.day1;

public class LowerCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		
		return new LowerCarEngine();
	}

	@Override
	public Seat createSeat() {
		
		return new LowerCarSeat();
	}

	@Override
	public Tyre createTyre() {
		
		return new LowerCarTyre();
	}

	
}
