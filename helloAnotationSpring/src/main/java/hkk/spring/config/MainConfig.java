package hkk.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import hkk.spring.events.MyEvents;
@Configuration
@ComponentScan("hkk.spring.events")
public class MainConfig {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		//利用容器发布事件
		ctx.publishEvent(new MyEvents(ctx));
	
	}

}
