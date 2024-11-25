package observerDesign;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observer> subscriber = new ArrayList<>();
    String notification;
    @Override
    public void subscribe(Observer ob) {
        this.subscriber.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscriber.remove(ob);
    }

    @Override
    public void notifyChanges(String changes) {
        for(Observer ob:this.subscriber){
            ob.notified(changes);
        }
    }

}
