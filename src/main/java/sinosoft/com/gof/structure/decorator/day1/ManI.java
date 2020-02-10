package sinosoft.com.gof.structure.decorator.day1;

public interface ManI {

	void run();
}

class Man implements ManI {

	@Override
	public void run() {
		System.out.println("我是一个正常的人，我只能是普通人!");
	}
	
}

class ManDecorator {
	public ManI man;
	public ManDecorator(ManI man) {
		this.man = man;
	}
	void run() {
		man.run();
	}
}

class SuperMan extends ManDecorator {

	public SuperMan(ManI man) {
		super(man);
	}
	@Override
	void run() {
		super.run();
		System.out.println("我还会飞哦!");
	}
	
}
class ZhiZhuXia extends ManDecorator {

	public ZhiZhuXia(ManI man) {
		super(man);
	}
	@Override
	void run() {
		super.run();
		System.out.println("我是蜘蛛侠，我还会穿越城市间!");
	}
	
}




