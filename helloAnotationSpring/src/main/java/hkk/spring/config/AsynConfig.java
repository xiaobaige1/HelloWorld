package hkk.spring.config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import hkk.spring.asyn.AsynService;

@Configuration
@EnableAsync
public class AsynConfig {
	
	@Bean
	public AsynService asynService(){
		return new AsynService();
	}
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AsynConfig.class);
		AsynService service = ctx.getBean(AsynService.class);
		for(int i=0;i<10;i++){
			service.getMethod1(i);
			service.getMethod2(i);
			
			System.out.println("这是主程序"+i);
		}
	}

}
