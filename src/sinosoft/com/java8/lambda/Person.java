package sinosoft.com.java8.lambda;

public class Person {

	String firstName;
	String lastName;
	Person() {}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
