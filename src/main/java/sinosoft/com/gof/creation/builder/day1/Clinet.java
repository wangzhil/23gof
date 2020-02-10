package sinosoft.com.gof.creation.builder.day1;

public class Clinet {

	public static void main(String[] args) {
		AMessage a = new AMessage("1","2");
        Director d = new Director();
        BMessage b = d.getBMessage(a);
		System.out.println(b);
	}
}
