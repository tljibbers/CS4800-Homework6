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

    public message send(user user, user[] recipients, message note)
    {
        if(user.isBlocked || (user.isRegistered == false))
        {
            System.out.println("Cannot send message. Either a recipient has blocked you or you are not registered");
        }
        else
        {
            return note;
        }

        return null;
    }
}
