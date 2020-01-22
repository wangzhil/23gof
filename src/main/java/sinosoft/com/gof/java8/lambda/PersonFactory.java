package sinosoft.com.gof.java8.lambda;

public interface PersonFactory<P extends Person> {

	P create(String firtName, String lastName);
}
