package sinosoft.com.gof.creation.abstractfactory.day1;

public interface Engine {

	void start();
	void run();
}

class LuxuryCarEngine implements Engine {

	@Override
	public void start() {
		System.out.println("高端发动机，自动启停!");
	}
	@Override
	public void run() {
		System.out.println("高端发动机，起步快!");
	}
	
}
class LowerCarEngine implements Engine {

	@Override
	public void start() {
        System.err.println("低端发动机，无自动启停!");
	}

	@Override
	public void run() {
		System.err.println("低端发动机，起步慢!");
	}
	
}
