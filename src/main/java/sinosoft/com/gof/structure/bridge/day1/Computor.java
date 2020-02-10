package sinosoft.com.gof.structure.bridge.day1;

public class Computor {

	public Brand brand;
	
	public Computor(Brand brand) {
		this.brand = brand;
	}
	public void sale() {
		brand.sale();
	}
}

class LapDesk extends Computor {

	public LapDesk(Brand brand) {
		super(brand);
		System.out.println("这是一台台式电脑!");
	}
}
class LapTop extends Computor {

	public LapTop(Brand brand) {
		super(brand);
		System.out.println("这是一台笔记本电脑!");
	}
}
class DeskTop extends Computor {

	public DeskTop(Brand brand) {
		super(brand);
		System.out.println("这是一台台式电脑!");
	}
}