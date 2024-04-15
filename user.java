import java.util.ArrayList;
import java.util.Scanner;

public class user {

    ArrayList<String> inbox = new ArrayList<String>();

    public message send(user[] recipient, message note)
    {
        Scanner messageContent = new Scanner(System.in);
        System.out.println("Message being sent to " + recipient);
        return note;
    }

    public void recieve(user sender, message note)
    {
        System.out.println("Message being recieved from " + sender);
        inbox.add(note.getMessageContent());
    }
    
}
