package Problem_II;

import java.util.ArrayList;
import java.util.List;

public interface PublisherUser {
    List<GenericDevice> subscribers = new ArrayList<GenericDevice>();

    Notification trigger();
    void subscribe();
    void unsubscribe();
}
