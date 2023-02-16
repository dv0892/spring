package springpro.ch3.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springpro.ch2.MessageProvider;

public class Decoupled {

	public static void main(String[] args) {
		System.out.println("\n Testing Constructor Injection....");
		
		ApplicationContext springAppContextXMLWithAnnotation = new GenericXmlApplicationContext("spring/ch3/app-context-annotated-spEL.xml");
		InjectSimpleSpel injectSimpleSpel = springAppContextXMLWithAnnotation.getBean("injectSimpleSpel" ,InjectSimpleSpel.class);
		
		System.out.println(injectSimpleSpel);
		

	}

}
