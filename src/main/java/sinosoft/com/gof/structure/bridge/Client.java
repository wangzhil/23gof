package sinosoft.com.gof.structure.bridge;

public class Client {

	public static void main(String[] args) {
		new LapTop(new Dell()).sale();
	}
}
