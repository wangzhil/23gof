package sinosoft.com.gof.structure.adaptor.day1;

public class UsbAdaptor extends UserUsb implements Ps {

	@Override
	public void Ps() {
		usb();
		
	}
	
	public static void main(String[] args) {
		UsbAdaptor adaptor = new UsbAdaptor();
		adaptor.usb();
	}

}
