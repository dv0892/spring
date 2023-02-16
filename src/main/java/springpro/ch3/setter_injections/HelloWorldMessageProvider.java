package springpro.ch3.setter_injections;

import org.springframework.stereotype.Component;

import springpro.ch2.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World of Spring Pro Chapter 3";
	}

}
