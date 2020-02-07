package sinosoft.com.gof.creation.prototype;

import lombok.Data;

@Data
public class Message implements Cloneable {

	private String msgId;
	private String message;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
