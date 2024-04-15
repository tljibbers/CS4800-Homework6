public class MessageMemento {
    private message state;

    public MessageMemento(message state) {
        this.state = state;
    }

    public String getState() {
        return state.getMessageContent();
    }

    public void setState(message state) {
        this.state = state;
    }
    
}
