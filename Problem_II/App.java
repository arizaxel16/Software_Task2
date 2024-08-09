package Problem_II;

public class App {
    public static void main(String[] args) {
        PublisherUser user_1 = new PublisherUser("user_1");
        PublisherUser user_2 = new PublisherUser("user_2");

        GenericDevice user_1Phone = new iPhone("user_1's iPhone");
        GenericDevice user_1Tablet = new Tablet("user_1's Tablet");

        GenericDevice user_2Phone = new iPhone("user_2's iPhone");

        user_1.pairDevice(user_1Phone);
        user_1.pairDevice(user_1Tablet);
        user_2.pairDevice(user_2Phone);

        user_1.sendMessage(user_2, "Hello!");
        user_2.sendMessage(user_1, "Meeting 9:00 AM");

        user_2.unPair(user_2Phone);
        user_1.sendMessage(user_2, "Lunch 12:00 PM");
    }
}
