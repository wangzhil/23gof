package sinosoft.com.gof.creation.abstractfactory;

public interface CarFactory {

	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}

