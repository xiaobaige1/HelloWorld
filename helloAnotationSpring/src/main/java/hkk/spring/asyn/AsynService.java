package hkk.spring.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsynService {
	@Async
	public void getMethod1(int i){
		System.out.println("this is ******** "+i);
	}
	@Async
	public void getMethod2(int i){
		System.out.println("this is @@@@@@@@"+i);
	}
}
