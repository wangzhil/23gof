package sinosoft.com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Stream8 {

	public static void main(String[] args) {
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		
		stringCollection
			.stream()
			.filter((name) -> name.startsWith("a"))
			.forEach(System.out::println);
		stringCollection
			.stream()
			.sorted()
			.filter((s) -> s.startsWith("b"))
			.forEach(System.out::println);
		stringCollection
			.stream()
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		stringCollection
			.stream()
			.filter((name) -> name.startsWith("a"));
	}
}
