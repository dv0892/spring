package springpro.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration1 {
	
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer messageRenderer = new StandardOutMessageRenderer();
		messageRenderer.setMessageProvider(provider());
		return messageRenderer;
	}
	
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider2() ;
	}

}
