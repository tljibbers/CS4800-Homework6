import java.util.ArrayList;

public class user {

    Boolean isRegistered;
    Boolean isBlocked;
    ChatServer chat = new ChatServer();
    ArrayList<String> inbox = new ArrayList<String>();

    public void send(user user, user[] recipients, message note)
    {
        chat.send(user, recipients, note);
    }

    public void recieve(user sender, message note)
    {
        System.out.println("Message being recieved from " + sender);
        inbox.add(note.getMessageContent());
    }

  
    
}
