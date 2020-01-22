package sinosoft.com.gof.structure.adaptor;

public interface Usb {

	public void doUsb();
}


class Usber implements Usb{

	@Override
	public void doUsb() {
		System.out.println("这里是Usb !");
	}
	
}