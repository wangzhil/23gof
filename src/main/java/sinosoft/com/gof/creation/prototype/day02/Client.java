package sinosoft.com.gof.creation.prototype.day02;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Work work = new Work();
		work.setWorkAddress("来福士广场");
		work.setWorkType("程序猿");
		People p = new People();
		p.setName("张三");
		p.setAddress("老家");
		p.setWork(work);
		People p1 = (People) p.clone();
		System.out.println(p.toString());
		System.out.println(p1.toString());
		
		work.setWorkAddress("来福士修改了");
		System.out.println(p.toString());
		System.out.println(p1.toString());
		
	}
}
