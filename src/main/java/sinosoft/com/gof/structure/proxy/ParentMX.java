package sinosoft.com.gof.structure.proxy;


public interface ParentMX {
    void confer();//面谈
	void signContract();//签合同
	void bookTicket();//订票
	void sing();//唱歌
	void collectMoney();//收尾款
}
class JieLun implements ParentMX{

	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
	}
	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
	}
	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}
	@Override
	public void sing() {
		System.out.println("JieLun.sing()");
	}
	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}
}
