package Problem_II;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private List<GenericDevice> subscribers = new ArrayList<>();

    public void addSubscriber(GenericDevice device) {
        subscribers.add(device);
    }

    public void removeSubscriber(GenericDevice device) {
        subscribers.remove(device);
    }

    public void notifyDevices(Notification notification) {
        for (GenericDevice subscriber : subscribers) {
            subscriber.update(notification);
        }
    }
}
