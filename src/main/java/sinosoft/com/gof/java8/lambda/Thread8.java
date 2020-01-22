package sinosoft.com.gof.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Thread8 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			dealSleep();
		});
		thread.start();
	}

	
	private static void dealSleep() {
		while (true) {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss").format(new Date()));
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
