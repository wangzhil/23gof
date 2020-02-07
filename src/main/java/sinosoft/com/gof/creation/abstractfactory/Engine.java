package sinosoft.com.gof.creation.abstractfactory;

public interface Engine {

	void run();
	void start();
}

class LuxuryEngine implements Engine {

	@Override
	public void run() {
		System.out.println("好发动机，跑得快!");
		
	}

	@Override
	public void start() {
		System.out.println("好发动机，自动启停!");
		
	}
	
}

class LowerEngine implements Engine {

	@Override
	public void run() {
		System.out.println("低端发动机，跑得慢!");
		
	}

	@Override
	public void start() {
		System.out.println("低端发动机，没自动启动!");
		
	}
	
}
