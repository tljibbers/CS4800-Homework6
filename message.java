import java.sql.Timestamp;
import java.time.Instant;
public class message {
    private String sender;
    private String[] recipient;
    Timestamp instant;
    private String messageContent;

    public message(String sender, String[] recipient, String messageContent)
    {
        this.sender = sender;
        this.recipient = recipient;
        this.messageContent = messageContent;
        instant = Timestamp.from(Instant.now());

    }

    public String getSender()
    {
        return sender;
    }

    public String[] getRecipient()
    {
        return recipient;
    }

   
    public String getMessageContent()
    {
        return instant + messageContent;
    }
}