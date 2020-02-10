package sinosoft.com.gof.creation.abstractfactory.day1;

public interface Tyre {
	void revole();
}

class LuxuryCarTyre implements Tyre {

	@Override
	public void revole() {
		System.out.println("高端汽车，可旋转！");
		
	}
	
}

class LowerCarTyre implements Tyre {

	@Override
	public void revole() {
		System.out.println("低端汽车，走远了!");
		
	}
	
}
