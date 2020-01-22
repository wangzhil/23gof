package sinosoft.com.gof.structure.adaptor;

public class Adaptor extends Usber implements Ps2{

	@Override
	public void doPs2() {
		doUsb();
	}

	public static void main(String[] args) {
		
		Adaptor adp = new Adaptor();
		adp.doPs2();
	}
	
}
