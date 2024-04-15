public class ChatServer {
    
  
    public void registerUser(user user)
    {
        user.isRegistered = true;
    }

    public void unRegisterUser(user user)
    {
        user.isRegistered = false;
    }

    public void blockUser(user user)
    {
        user.isBlocked = true;
    }

    public message sendMessage(user user, user[] recipients, message note)
    {
        if(user.isRegistered == false)
        {
            System.out.println("User is not registered to send messages. Register to be able to.");
           
        }
        if(user.isBlocked == true)
        {
            System.out.println("A user has blocked you from sending a message.");
        }
        return note;
    }
}
