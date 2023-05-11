package test.myaspect;

import org.springframework.stereotype.Component;

@Component
public class WritingUtil {

	public void write1() {
		System.out.println("write1 호출");
	}
	
	public void write2() {
		System.out.println("write2 호출");
	}
	
	public void write3() {
		System.out.println("write3 호출");
	}
	
}
