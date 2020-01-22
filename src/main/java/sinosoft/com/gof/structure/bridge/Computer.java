package sinosoft.com.gof.structure.bridge;

public class Computer {
    private Brand brand;
	public Computer(Brand brand) {
		this.brand = brand;
	}
	public void sale (){
		brand.sale();
	}
}
class DeskTop extends Computer {
	public DeskTop(Brand brand) {
		super(brand);
		System.out.println("这是台式机。");
	}
}
class LapTop extends Computer {
	public LapTop(Brand brand) {
		super(brand);
		System.out.println("这是笔记本。");
	}
}