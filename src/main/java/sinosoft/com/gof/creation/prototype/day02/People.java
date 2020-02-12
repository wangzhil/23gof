package sinosoft.com.gof.creation.prototype.day02;

import lombok.Data;

@Data
public class People implements Cloneable {

	private String name;
	private String address;
	private Work work;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 请注意是super  
		People p = (People) super.clone();
		p.setWork((Work)p.getWork().clone());
		return p;
	}
	
}

