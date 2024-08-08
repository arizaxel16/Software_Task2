package Problem_II;

import java.util.ArrayList;
import java.util.List;

public class PublisherUser {
    private String user;
    List<GenericDevice> subscribers = new ArrayList<GenericDevice>();

    public PublisherUser(String user) {
        this.user = user;
    }

    public void trigger(Notification notification) {
        for (GenericDevice subscriber : subscribers) {
            subscriber.update(notification);
        }
    }

    public void subscribe(GenericDevice device) {
        this.subscribers.add(device);
    }

    public void unsubscribe(GenericDevice device) {
        this.subscribers.remove(device);
    }

    public String getUser() {
        return user;
    }
}
