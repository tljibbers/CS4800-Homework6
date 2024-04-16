import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChatHistory implements IterableByUser{
    
    HashMap<user, String> chatLog = new HashMap<user, String>();

    public void addMessage(user name, message message, HashMap<user, String> chatLog)
    {
        chatLog.put(name, message.getMessageContent());
    }

    public void getLastMessageSent(HashMap<user, String> chatLog)
    {
        int count = 1;

        for (Map.Entry<user, String> iterator : chatLog.entrySet())
        {
            if (count == chatLog.size())
            {
                System.out.println(iterator.getKey() + iterator.getValue());
            }
            count++;
        }
    }

    public Iterator<message> iterator(user userToSearchWith)
    {
        for (Map.Entry<user, String> iterator : chatLog.entrySet())
        {
            if (userToSearchWith == iterator.getKey())
            {
                System.out.println(iterator.getKey() + iterator.getValue());
            }
        }

        return null;
    }
}
