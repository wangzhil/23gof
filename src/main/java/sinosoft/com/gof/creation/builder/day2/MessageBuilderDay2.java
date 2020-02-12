package sinosoft.com.gof.creation.builder.day2;

public class MessageBuilderDay2 {

	private BMessageDay2 bMessageDay2 = new BMessageDay2();

	public MessageBuilderDay2(AMessageDay2 aMessage) {
		super();
		bMessageDay2.setCreateTime("axxxTime");
		bMessageDay2.setId(aMessage.getId());
		bMessageDay2.setMsg(aMessage.getMsg());
		bMessageDay2.setTemplate("template");
	}
	
	public BMessageDay2 getBMessage() {
		return bMessageDay2;
	}
	
	
}
