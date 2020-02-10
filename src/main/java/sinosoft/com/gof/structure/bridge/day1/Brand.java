package sinosoft.com.gof.structure.bridge.day1;

public interface Brand {

	void sale();
}

class Dell implements Brand {

	@Override
	public void sale() {
	    System.out.println("我要销售戴尔电脑!");
	}	
}
class Apple implements Brand {

	@Override
	public void sale() {
		System.out.println("苹果电脑很辣鸡，但是大家很喜欢!");
	}	
}
class Huawei implements Brand {

	@Override
	public void sale() {
	    System.out.println("华为电脑哇!华为！卖掉卖掉!");
	}	
}