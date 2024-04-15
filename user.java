import java.util.ArrayList;

public class user {

    Boolean isRegistered;
    Boolean isBlocked;
    ChatServer chat = new ChatServer();
    ChatHistory history = new ChatHistory();
    ArrayList<String> inbox = new ArrayList<String>();
    message note;
    private MessageMemento memento = new MessageMemento(note);

    public void send(user user, user[] recipients, message note)
    {
        chat.send(user, recipients, note);
        history.addMessage(user, note);
    }

    public void recieve(user sender, message note)
    {
        System.out.println("Message being recieved from " + sender);
        inbox.add(note.getMessageContent());
    }

    public void undo()
    {
        note = memento.getState();
    }

  
    
}
