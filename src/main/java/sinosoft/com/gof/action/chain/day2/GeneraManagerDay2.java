package sinosoft.com.gof.action.chain.day2;

public class GeneraManagerDay2 extends LeaderDay2 {

	public GeneraManagerDay2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequestDay2 request) {
		if (request.getDays() < 30) {
			System.out.println("30天总经理请假审核成功!");
		} else {
			System.err.println("不用请假了，回家吧!");
		}
		
	}

}
