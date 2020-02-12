package sinosoft.com.gof.action.chain.day2;

public class Client {

	public static void main(String[] args) {
		LeaderDay2 a = new DirectorDay2("张三");
		LeaderDay2 b = new ManagerDay2("李四");
		LeaderDay2 c = new GeneraManagerDay2("王武");
		a.setNextLeader(b);
		b.setNextLeader(c);
		LeaveRequestDay2 req = new LeaveRequestDay2();
		req.setDays(23);
		a.handleRequest(req);
	}
}
