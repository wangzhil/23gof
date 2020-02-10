package sinosoft.com.gof.creation.abstractfactory.day1;

public interface Seat {

	void message();
	
}

class LuxuryCarSeat implements Seat {

	@Override
	public void message() {
		System.out.println("高端座椅,坐着真舒适!");
		
	}
	
}
class LowerCarSeat implements Seat {

	@Override
	public void message() {
		System.out.println("低端座椅，坐着不是那么舒服!");
		
	}
	
}
