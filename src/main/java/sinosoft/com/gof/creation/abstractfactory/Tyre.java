package sinosoft.com.gof.creation.abstractfactory;

public interface Tyre {

	void revole();
	
}

class LuxuryTyre implements Tyre {

	@Override
	public void revole() {
        System.out.println("高端座椅,旋转不磨损!"); 		
	}
	
}

class LowerTyre implements Tyre {

	@Override
	public void revole() {
        System.out.println("低端座椅,旋转磨损!"); 		
	}
	
}
