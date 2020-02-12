package sinosoft.com.gof.creation.prototype.day02;

import lombok.Data;

@Data
public class Work implements Cloneable {

	private String workAddress;
	private String workType;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
