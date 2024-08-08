package Problem_II;

public class iPhone implements GenericDevice {
    private String name;

    public iPhone(String name){
        this.name = name;
    }

    @Override
    public void update(Notification notification) {
        System.out.println(
            "\nReceived Notification on " + this.name +
            "\nSender: " + notification.getSender() +
            "\nMessage: " + notification.getMsg()
        );
    }
}
