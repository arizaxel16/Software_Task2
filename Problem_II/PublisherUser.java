package Problem_II;

public class PublisherUser {
    private String user;
    private NotificationManager notificationManager;

    public PublisherUser(String user) {
        this.user = user;
        this.notificationManager = new NotificationManager();
    }

    public void sendMessage(PublisherUser recipient, String message) {
        Notification notification = new Notification(this, message);
        recipient.getNotificationManager().notifyDevices(notification);
    }

    public void pairDevice(GenericDevice device) {
        this.notificationManager.addSubscriber(device);
    }

    public void unPair(GenericDevice device) {
        this.notificationManager.removeSubscriber(device);;
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public String getUser() {
        return user;
    }
}
