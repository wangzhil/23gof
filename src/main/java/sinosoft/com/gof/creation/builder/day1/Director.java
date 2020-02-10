package sinosoft.com.gof.creation.builder.day1;

public class Director {

	private XXBulider builder = new XXBulider();
	
	public BMessage getBMessage(AMessage aMessage) {
		builder.builderMessage(aMessage);
		return builder.getBMessage();
	}
}
