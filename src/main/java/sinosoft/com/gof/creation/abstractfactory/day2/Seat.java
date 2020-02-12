package sinosoft.com.gof.creation.abstractfactory.day2;

public interface Seat {

	void message();
}

class LuxurySeatDay2 implements Seat {

	@Override
	public void message() {
		System.err.println("高端座椅，坐着舒服啊!");
	}
}

class LowerSeatDay2 implements Seat {

	@Override
	public void message() {
		System.err.println("低端座椅，坐着一般!");
		
	}
}