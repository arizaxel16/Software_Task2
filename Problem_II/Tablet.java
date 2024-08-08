package Problem_II;

public class Tablet implements GenericDevice {
    private String name;

    public Tablet(String name){
        this.name = name;
    }

    @Override
    public void update(Notification notification) {
        System.out.println(
            "\nReceived Notification on " + this.name +
            "\nSender: " + notification.getSender() +
            "\nMessag: " + notification.getMsg()
        );
    }
}
