public class MessageMemento {
    private message state;

    public MessageMemento(message state) {
        this.state = state;
    }

    public message getState() {
        return state;
    }

    public void setState(message state) {
        this.state = state;
    }
    
}
