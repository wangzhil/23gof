package sinosoft.com.gof.creation.abstractfactory.day2;

public interface Engine {

	void start();
	void run();
}
class LuxuryEngineDay2 implements Engine {

	@Override
	public void start() {
		System.err.println("高端发动起启动!!!嗡!!!!嗡!!!嗡!!!");
	}
	@Override
	public void run() {
		System.err.println("高端发动机运行!!!!嗡~~~~~~~~~~");
	}
}

class LowerEngineDay2 implements Engine {

	@Override
	public void start() {
		System.err.println("低端发动机启动!!!嗡。");
	}
	@Override
	public void run() {
		System.err.println("低端发动机运行!!!!嗡。");
	}
}
