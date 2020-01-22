package sinosoft.com.gof.java8.lambda;

public class Point8 {

	public static void main(String[] args) {
		PersonFactory<Person> factory = Person :: new;
		Person person = factory.create("wang", "Jack");
		System.out.println(person.toString());
	}

}
