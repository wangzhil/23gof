package sinosoft.com.gof.action.strategy.day2;

public enum MsgType {

	TEXT("1", "文本"), IMAGE("2", "图片"), VEDIO("3", "音频");
	protected String code;
	protected String desc;

	private MsgType(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
}
