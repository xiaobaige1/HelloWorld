package hkk.spring.javaBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//System.out.println(ac.getBean("user"));
		//User user = ac.getBean(User.class);
		String[] beanNames = ac.getBeanNamesForType(User.class);
		//System.out.println(user);
		for (String string : beanNames) {
			System.out.println(string);
			
		}
		User user = (User) ac.getBean("hkk.spring.javaBeans.User#0");
		User user2 = (User) ac.getBean("user");
		User user3 = (User) ac.getBean("user");
		System.out.println(user3==user2);
	}

}
