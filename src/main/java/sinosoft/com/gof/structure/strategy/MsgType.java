package sinosoft.com.gof.structure.strategy;

/**
 * @date 2020/1/22
 * @author wangzl
 * @description: 消息类型，根据类型使用不同逻辑处理
 *
 */
public enum MsgType {

	TEXT("1", "文本"), IMAGE("2", "图片"), VEDIO("3", "音频");
	public final String code;
	public final String desc;
	MsgType(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}
