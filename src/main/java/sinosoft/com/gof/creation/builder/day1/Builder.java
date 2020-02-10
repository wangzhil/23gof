package sinosoft.com.gof.creation.builder.day1;

public interface Builder {

	void builderMessage(AMessage aMessage);
	BMessage getBMessage();
}

class XXBulider implements Builder {

	private BMessage bMessage = new BMessage();
	@Override
	public void builderMessage(AMessage aMessage) {
		
		bMessage.setId(aMessage.getMsg());
		bMessage.setMsg(aMessage.getMsg());
		bMessage.setCreateTime("现在！");
		bMessage.setName("汪洋");
		bMessage.setToOthers("是谁是谁");
		
	}

	@Override
	public BMessage getBMessage() {
		return bMessage;
	}
	
}
