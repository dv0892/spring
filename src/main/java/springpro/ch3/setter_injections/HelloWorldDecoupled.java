package springpro.ch3.setter_injections;

import java.io.File;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import springpro.ch2.MessageRenderer;

@Component
public class HelloWorldDecoupled {

	public static void main(String[] args) {
		
		/* This section uses XML based Configuration ....*/
		
		System.out.println("\nUsing XML Based Configuration ....");
		
		ApplicationContext springAppContextXML = new GenericXmlApplicationContext("spring/ch3/app-context-xml-setter-injection.xml");
		MessageRenderer messageRenderer1 = springAppContextXML.getBean("renderer",MessageRenderer.class);
		messageRenderer1.render(); 
		
		/* This section uses XML based Configuration with annotation ....*/
		
		System.out.println("\nUsing XML Based Configuration With annotations....");
		
		ApplicationContext springAppContextXMLWithAnnotation = new GenericXmlApplicationContext("spring/ch3/app-context-annotated-setter-injection.xml");
		MessageRenderer messageRenderer2 = springAppContextXMLWithAnnotation.getBean("renderer",MessageRenderer.class);
		messageRenderer2.render(); 
		
		/* This section uses Java Based Configuration along without component scanning.*/
		
		System.out.println("\nUsing Java Based Configuration....");

		ApplicationContext springAppContextJavaConfig = new AnnotationConfigApplicationContext(HelloWorldConfigurationWithoutComponentScanning.class);
		MessageRenderer messageRenderer3 = springAppContextJavaConfig.getBean("renderer",MessageRenderer.class);
		messageRenderer3.render(); 
		
		/* This section uses Java Based Configuration with Component Scanning. */
		
		System.out.println("\nUsing Java Based Configuration With Component Scanning ....");

		ApplicationContext springAppContextJavaConfigWithComponentScanning = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer messageRenderer4 = springAppContextJavaConfigWithComponentScanning.getBean("renderer",MessageRenderer.class);
		messageRenderer4.render();

	}

}
