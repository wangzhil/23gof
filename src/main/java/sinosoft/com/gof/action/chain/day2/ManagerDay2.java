package sinosoft.com.gof.action.chain.day2;

public class ManagerDay2 extends LeaderDay2 {

	public ManagerDay2(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequestDay2 request) {
		if (request.getDays() < 10) {
			System.out.println("经理请假审核成功!");
		} else {
			if (nextLeader != null) {
				nextLeader.handleRequest(request);
			}
		}	
	}

}
