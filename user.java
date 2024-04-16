import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class user implements IterableByUser{

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

    public void recieve(message note)
    {
        System.out.println("Message being recieved from " + note.getSender());
        inbox.add(note.getMessageContent());
        System.out.println(inbox);
    }

    public void undo()
    {
        note = memento.getState();
    }

    public void checkHistory()
    {
        history.getLastMessageSent(chatLog);
    }

    @Override
    public Iterator<message> iterator(user userToSearchWith) {
        history.iterator(userToSearchWith);
        return null;
    }

  
    
}
