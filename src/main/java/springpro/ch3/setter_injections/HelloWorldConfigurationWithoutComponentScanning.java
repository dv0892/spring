
package springpro.ch3.setter_injections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springpro.ch3.setter_injections.HelloWorldMessageProvider;
import springpro.ch2.MessageProvider;
import springpro.ch2.MessageRenderer;
import springpro.ch3.setter_injections.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfigurationWithoutComponentScanning {

	@Bean
	public MessageRenderer renderer() {
		MessageRenderer messageRenderer = new StandardOutMessageRenderer();
		messageRenderer.setMessageProvider(provider());
		return messageRenderer;
	}
	
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider() ;
	}
}
