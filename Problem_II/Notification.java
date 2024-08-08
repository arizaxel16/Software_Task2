package Problem_II;

public class Notification {
    private String sender;
    private String msg;

    public Notification(String sender, String msg) {
        this.sender = sender;
        this.msg = msg;
    }

    public String getSender() {
        return sender;
    }

    public String getMsg() {
        return msg;
    }
}
