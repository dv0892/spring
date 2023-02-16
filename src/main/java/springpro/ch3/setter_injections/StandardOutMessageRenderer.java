package springpro.ch3.setter_injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springpro.ch2.MessageProvider;
import springpro.ch2.MessageRenderer;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
	
	MessageProvider messageProvider;
	
	@Override
	public void render() {
		java.util.Objects.requireNonNull(messageProvider, " Message Provider is not available. Please provider a message provider.");
		System.out.println( messageProvider.getMessage());
	}

	@Override
	@Autowired
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;

	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
