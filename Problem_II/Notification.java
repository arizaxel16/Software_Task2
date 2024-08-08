package Problem_II;

public class Notification {
    private String sender;
    private String msg;

    public Notification(PublisherUser user, String msg) {
        this.sender = user.getUser();
        this.msg = msg;
    }

    public String getSender() {
        return sender;
    }

    public String getMsg() {
        return msg;
    }
}
