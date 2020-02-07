package sinosoft.com.gof.creation.factory.method;

public interface CarMethod {

	void running();
	void driving();
}

class AudiCar implements CarMethod {

	@Override
	public void running() {
		System.out.println("AudiCar running!");
		
	}

	@Override
	public void driving() {
		System.out.println("AudiCar driving!");
		
	}
	
}


class VolvoCar implements CarMethod {
	@Override
	public void running() {
		System.out.println("VolvoCar running!");
		
	}

	@Override
	public void driving() {
		System.out.println("VolvoCar driving!");
		
	}
}
