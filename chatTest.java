import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class chatTest {

    user u = new user();
    user u2 = new user();
    user u3 = new user();
    user[] collective = {u2, u3}; 
    ChatServer cs = new ChatServer();
    ChatHistory ch = new ChatHistory();
    Boolean isRegistered = false;
    Boolean isBlocked = false;
    message m = new message("Test sender", "test recipients", "test message");
    ArrayList<String> inbox = new ArrayList<String>();
    HashMap<user, String> chatLog = new HashMap<user, String>();



    @Test
    public void testSend()
    {
        u.send(u, collective, m);
    }

    @Test
    public void testRecieve()
    {
        u2.recieve(m);
        u3.recieve(m);
    }

    @Test
    public void testundo()
    {
        u.undo();
    }

    @Test
    public void testCheckHistory()
    {
        u.checkHistory();
    }

    @Test
    public void iterator()
    {
        u.iterator(u);
        ch.iterator(u);
    }

    @Test
    public void testRegister()
    {
        cs.registerUser(u);
    }

    @Test
    public void testUnregister()
    {
        cs.unRegisterUser(u);
    }

    @Test
    public void testBlock()
    {
        cs.blockUser(u, u2);
    }

    @Test
    public void testCSSend()
    {
        cs.sendMessage(u, collective, m);
    }

    @Test
    public void testaddMessage()
    {
        ch.addMessage(u, m, chatLog);
    }

    @Test
    public void testGetLastMessageSent()
    {
        ch.getLastMessageSent(chatLog);
    }

    


   

  
 
}
