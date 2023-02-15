package springpro.ch2;

public class StandardOutMessageRenderer implements MessageRenderer {
	
	MessageProvider messageProvider;
	
	@Override
	public void render() {
		java.util.Objects.requireNonNull(messageProvider, " Message Provider is not available. Please provider a message provider.");
		System.out.println( messageProvider.getMessage());
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;

	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
