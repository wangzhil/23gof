package sinosoft.com.gof.structure.bridge.day1;

public class Client {

	public static void main(String[] args) {
		new DeskTop(new Dell()).sale();
		new LapTop(new Huawei()).sale();
	}
}
