import java.util.ArrayList;
import java.util.HashMap;

public class user {

    Boolean isRegistered = false;
    Boolean isBlocked = false;
    ChatServer chat = new ChatServer();
    ChatHistory history = new ChatHistory();
    ArrayList<String> inbox = new ArrayList<String>();
    HashMap<user, String> chatLog = new HashMap<user, String>();
    message note;
    private MessageMemento memento = new MessageMemento(note);

    public void send(user user, user[] recipients, message note)
    {
        chat.sendMessage(user, recipients, note);
        history.addMessage(user, note, chatLog);
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
