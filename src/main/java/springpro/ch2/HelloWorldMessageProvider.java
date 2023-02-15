package springpro.ch2;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World of Spring Pro";
	}

}
