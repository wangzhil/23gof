package sinosoft.com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort8 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		// 1.java8之前的写法
		/*Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});*/
		// 2. 换成lambda表达式的写法
		/*Collections.sort(names, (String name1, String name2) -> {
			return name2.compareTo(name1);
		});*/
		// 3. 省略return的写法
		//Collections.sort(names, (String name1, String name2) -> name2.compareTo(name1));
		// 4. 最终形式  省略return 和 变量类型，编译器能自动辨别
		Collections.sort(names, (name1, name2) -> name2.compareTo(name1));
		names.stream().forEach(System.out::println);
		
	}
}
