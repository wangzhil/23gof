package sinosoft.com.gof.creation.prototype;

import lombok.Data;

/**
 * @description 父类子类集成cloneable，父类重写clone方法。
 * @author devel
 *
 */
@Data
public class Student implements Cloneable {

	private String name;
	private Integer age;
	private String classes;
	private Message message;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s = (Student)super.clone();
		s.setMessage((Message)s.getMessage().clone());
		return s;
	}


	public static void main(String[] args) {
		Student s = new Student();
		Message mes = new Message();
		mes.setMessage("消息");
		mes.setMsgId("1");
		s.setAge(11);
		s.setClasses("5班");
		s.setName("小明");
		s.setMessage(mes);
		
		Student s1 = null;
		try {
			s1 = (Student) s.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("s:"+ s.toString());
		System.out.println("s1:"+ s1.toString());
		s.setName("小王");
		mes.setMessage("消息变");
		System.out.println("s:"+ s.toString());
		System.out.println("s1:"+ s1.toString());
	}
	
	
	
	
	
}


