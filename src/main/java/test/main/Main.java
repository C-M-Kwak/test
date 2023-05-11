package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.myaspect.WritingUtil;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test/main/init.xml");
		WritingUtil util = context.getBean(WritingUtil.class);
		util.write1();
		util.write2();
		util.write3();
	}
	
}