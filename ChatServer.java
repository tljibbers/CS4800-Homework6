public class ChatServer {
    
  
    public void registerUser(user user)
    {
        user.isRegistered = true;
        System.out.println(user + " has registered.");
    }

    public void unRegisterUser(user user)
    {
        user.isRegistered = false;
        System.out.println(user + " has unregistered.");
    }

    public void blockUser(user user, user blocker)
    {
        user.isBlocked = true;
        System.out.println(user + " has been blocked by " + blocker);
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
