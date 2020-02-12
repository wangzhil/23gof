package sinosoft.com.gof.action.chain.day2;

public class DirectorDay2 extends LeaderDay2 {

	public DirectorDay2(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequestDay2 request) {
		if (request.getDays() < 3) {
			System.out.println("3天内请假审核成功!");
		} else {
			if (nextLeader != null) {
				nextLeader.handleRequest(request);
			}
		}
	}
}
