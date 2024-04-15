import java.util.ArrayList;

public class user {

    ArrayList<message> inbox = new ArrayList<message>();

    public void send(user[] recipient, message note)
    {
        System.out.println("Message being sent to " + recipient);
    }

    public void recieve(user sender, message note2)
    {
        System.out.println("Message being recieved from " + sender);
        inbox.add(note2);
    }
    
}
