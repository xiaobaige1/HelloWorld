package hkk.spring.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventsListener implements ApplicationListener<MyEvents>{

	public void onApplicationEvent(MyEvents myEvents) {
		// TODO Auto-generated method stub
		System.out.println(myEvents.click());
	}

}
