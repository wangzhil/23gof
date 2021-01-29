package sinosoft.com.gof;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sinosoft.com.gof.structure.proxy.SampleClass;

@SpringBootTest
class ApplicationTests {

	public String test(String input){
		return "hello world";
	}

	@Test
	void contextLoads() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(SampleClass.class);
		enhancer.setCallback(new FixedValue() {
			@Override
			public Object loadObject() throws Exception {
				return "Hello cglib";
			}
		});

		SampleClass proxy = (SampleClass) enhancer.create();
		System.out.println(proxy.toString());
		System.out.println(proxy.getClass());
		System.out.println(proxy.hashCode());

	}

}
