package sinosoft.com.gof.creation.factory.simple.day2;

public interface CarDay2 {

	void run();
}

class AudiCarDay2 implements CarDay2 {

	@Override
	public void run() {
		System.err.println("奥迪小车在奔跑!");
		
	}
	
}

class VolvoCarDay2 implements CarDay2 {

	@Override
	public void run() {
		System.err.println("沃尔沃小车在奔跑!");
		
	}
	
}
