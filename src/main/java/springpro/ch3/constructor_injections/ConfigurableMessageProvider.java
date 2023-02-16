package springpro.ch3.constructor_injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import springpro.ch2.MessageProvider;

@Component("provider")
public class ConfigurableMessageProvider implements MessageProvider {

	@Autowired
	String message ;
	
	@Autowired
	ConfigurableMessageProvider( String message ){
		System.out.println( this.message );
		System.out.println( message );
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
