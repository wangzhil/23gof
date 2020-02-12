package sinosoft.com.gof.action.chain.day2;

import lombok.Data;

@Data
public abstract class LeaderDay2 {

	protected LeaderDay2 nextLeader;
	private String name;
	public LeaderDay2(String name) {
		super();
		this.name = name;
	}
	
	public abstract void handleRequest(LeaveRequestDay2 request);
	
}
