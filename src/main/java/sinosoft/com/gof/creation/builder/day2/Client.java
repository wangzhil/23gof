package sinosoft.com.gof.creation.builder.day2;

public class Client {

	public static void main(String[] args) {
		System.out.println(new MessageBuilderDay2(new AMessageDay2("ID", "mSG!")).getBMessage().toString());;
	}
}
