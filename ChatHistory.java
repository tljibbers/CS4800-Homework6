import java.util.HashMap;
import java.util.Map;

public class ChatHistory {
    
    HashMap<user, String> chatLog = new HashMap<user, String>();

    public void addMessage(user name, message message)
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
}
