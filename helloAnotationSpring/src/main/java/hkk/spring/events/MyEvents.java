package hkk.spring.events;

import org.springframework.context.ApplicationEvent;

public class MyEvents extends ApplicationEvent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyEvents(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	public String click(){
		return "单击事件返回的数据";
	}
	
	
}
