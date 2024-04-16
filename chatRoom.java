public class chatRoom {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        user jordan = new user();
        user cole = new user();
        user dan = new user();
        message forColeAndDan = new message("Jordan", "Cole, Dan", "Did you finish the homework that's due today?");
        message forDan = new message("Cole", "Dan", "I didn't do the homework, can you send me yours?");
        message forJordan = new message("Dan", "Jordan", "Bro did you block me?");
        user[] collective = {cole, dan};
        user[] justDan = {dan};
        user[] justJordan = {jordan};
        chatServer.registerUser(dan);
        chatServer.registerUser(cole);
        chatServer.registerUser(jordan);

        jordan.send(jordan, collective, forColeAndDan);
        cole.recieve(forColeAndDan);
        dan.recieve(forColeAndDan);
        jordan.checkHistory();

        cole.send(cole, justDan, forDan);
        cole.undo();
        
        cole.iterator(jordan);

        chatServer.blockUser(dan, jordan);
        dan.send(dan, justJordan, forJordan);

        chatServer.unRegisterUser(dan);
        
    }
    
}
