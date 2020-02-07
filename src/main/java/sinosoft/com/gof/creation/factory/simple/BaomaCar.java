package sinosoft.com.gof.creation.factory.simple;

public class BaomaCar implements Car {

	@Override
	public void running() {
		System.out.println("BaomaCar running!");
		
	}

	@Override
	public void driving() {
		System.out.println("BaomaCar driving!");
		
	}

}
