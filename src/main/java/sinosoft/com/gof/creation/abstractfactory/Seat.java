package sinosoft.com.gof.creation.abstractfactory;

public interface Seat {

	void message();
}

class LuxurySeat implements Seat {

	@Override
	public void message() {
		System.out.println("高端的座椅，可以按摩！");
		
	}
	
}

class LowerSeat implements Seat {

	@Override
	public void message() {
		System.out.println("低端的座椅，不可以按摩！");
		
	}
	
}