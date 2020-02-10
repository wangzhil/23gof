package sinosoft.com.gof.structure.adaptor.day1;

public interface Usb {
    void usb();
}

class UserUsb implements Usb {

	@Override
	public void usb() {
		System.out.println("this is usb !");
		
	}
	
}