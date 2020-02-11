package sinosoft.com.gof.action.chain;

public class Client {

	public static void main(String[] args) {
		Leader a = new Director("zhangsan");
		Leader b = new Manager("里斯");
		Leader c = new GeneraManager("王武");
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest request = new LeaveRequest("Tom", 2, "回英国老家");
		a.handleRequest(request);
	}
}
