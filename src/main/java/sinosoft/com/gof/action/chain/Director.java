package sinosoft.com.gof.action.chain;

public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 3) {
			System.err.println("员工：" + request.getEmpName() + "请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
			System.out.println("菜鸡通过！");
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}
		}
		
	}
	
	

}
