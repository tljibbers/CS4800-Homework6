public class chatRoom {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        user jordan = new user();
        user cole = new user();
        user dan = new user();
        message forColeAndDan = new message("Jordan", "Cole, Dan", "Did you finish the homework that's due today?");
        user[] collective = {cole, dan};
        chatServer.registerUser(dan);
        chatServer.registerUser(cole);
        chatServer.registerUser(jordan);

        jordan.send(jordan, collective, forColeAndDan);
        cole.recieve(forColeAndDan);
        dan.recieve(forColeAndDan);
    }
    
}
