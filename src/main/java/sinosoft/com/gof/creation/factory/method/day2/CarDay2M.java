package sinosoft.com.gof.creation.factory.method.day2;

public interface CarDay2M {

	void run();
	void start();
}

class AudiCarMDay2 implements CarDay2M {

	@Override
	public void run() {
		System.err.println("小奥迪奔跑，呜呜呜呜!");
		
	}

	@Override
	public void start() {
		System.err.println("小奥迪启动，翁嗡嗡!!");
		
	}
	
}
class VolvoCarMDay2 implements CarDay2M {

	@Override
	public void run() {
		System.err.println("沃尔沃奔跑，呜呜呜呜!");
		
	}

	@Override
	public void start() {
		System.err.println("沃尔沃启动，翁嗡嗡!!");
		
	}
	
}
