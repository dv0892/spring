package springpro.ch3.constructor_injections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springpro.ch2.MessageProvider;
import springpro.ch2.MessageRenderer;

public class Decoupled {

	public static void main(String[] args) {
		System.out.println("\n Testing Constructor Injection....");
		
		ApplicationContext springAppContextXMLWithAnnotation = new GenericXmlApplicationContext("spring/ch3/app-context-annotated-const-injection.xml");
		MessageProvider messageProvider = springAppContextXMLWithAnnotation.getBean("provider",MessageProvider.class);
		
		System.out.println( messageProvider.getMessage());
	}

}
