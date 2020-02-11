package sinosoft.com.gof.action.chain;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 10) {
			System.err.println("员工：" + request.getEmpName() + "请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
			System.err.println("经理："+ this.name + "审批通过!");
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}
	

	
}
