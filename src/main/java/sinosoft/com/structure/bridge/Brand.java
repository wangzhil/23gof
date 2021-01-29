package sinosoft.com.structure.bridge;

public interface Brand { 
	public void sale();
}
class Dell implements Brand {
	@Override
	public void sale() {
		System.out.println("销售Dell电脑!!");
	}
}
class Lenove implements Brand {
	@Override
	public void sale() {
		System.out.println("销售Lenove电脑!!");
	}
}