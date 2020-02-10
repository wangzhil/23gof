package sinosoft.com.gof.creation.abstractfactory.day1;

public interface CarFactory {

	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
