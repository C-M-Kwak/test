package test.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PenAspect {

	@Before("execution(void write*())")
	public void prepare() {
		System.out.println("준비");
	}
	
	@After("execution(void write*())")
	public void after() {
		System.out.println("마무리");
	}
	
}
