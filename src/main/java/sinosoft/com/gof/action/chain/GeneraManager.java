package sinosoft.com.gof.action.chain;

public class GeneraManager extends Leader {

	public GeneraManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.err.println("员工：" + request.getEmpName() + "请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
			System.err.println("总经理："+ this.name + "审批通过!");
		} else {
			System.out.println(request.getEmpName() + "请假"+request.getLeaveDays()+"天，想搞什么!");
		}
	}
}
