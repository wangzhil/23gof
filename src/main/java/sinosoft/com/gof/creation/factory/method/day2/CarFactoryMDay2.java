package sinosoft.com.gof.creation.factory.method.day2;

public interface CarFactoryMDay2 {

	CarDay2M createCarInstance(); 
}

class AudiCarMFactoryDay2 implements CarFactoryMDay2 {

	@Override
	public CarDay2M createCarInstance() {
		
		return new AudiCarMDay2();
	}
	
}
class VolvoCarMFactoryDay2 implements CarFactoryMDay2 {

	@Override
	public CarDay2M createCarInstance() {
		
		return new VolvoCarMDay2();
	}
	
}
