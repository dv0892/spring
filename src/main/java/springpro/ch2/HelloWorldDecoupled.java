package springpro.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldDecoupled {

	public static void main(String[] args) {
		/* This code also works but it has design flaws like
		 * it is tightly glued and whenever we want to use new providers and renderers we would need
		 * to change this code. For solving this  we can use Spring or any DI Container( like PICO Container, Guice, etc) 
		 * to load our dependencies.
		 
		MessageProvider messageProvider = new HelloWorldMessageProvider();
		MessageRenderer messageRenderer = new StandardOutMessageRenderer();
		messageRenderer.setMessageProvider(messageProvider);
		messageRenderer.render();
		*/
		
		ApplicationContext springAppContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer messageRenderer = springAppContext.getBean("renderer",MessageRenderer.class);
		messageRenderer.render();

		
		ApplicationContext springAppContext1 = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer messageRenderer1 = springAppContext1.getBean("renderer",MessageRenderer.class);
		
		System.out.println(messageRenderer);
		System.out.println(messageRenderer1);
		
		//messageRenderer1.render();
	}

}
