import java.util.ArrayList;

public class user {

    ArrayList<String> inbox = new ArrayList<String>();

    public void send(user[] recipient, message note)
    {
        System.out.println("Message being sent to " + recipient);
    }

    public void recieve(user sender, message note)
    {
        System.out.println("Message being recieved from " + sender);
        inbox.add(note.getMessageContent());
    }
    
}
