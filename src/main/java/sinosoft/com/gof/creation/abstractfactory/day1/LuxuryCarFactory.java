package sinosoft.com.gof.creation.abstractfactory.day1;

import sinosoft.com.gof.creation.abstractfactory.day1.CarFactory;


public class LuxuryCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LuxuryCarEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxuryCarSeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryCarTyre();
	}

	
}
