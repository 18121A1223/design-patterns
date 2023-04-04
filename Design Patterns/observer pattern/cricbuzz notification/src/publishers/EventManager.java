package publishers;

import listeners.Listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<Listeners>> SubscriberList = new HashMap<>();
    public EventManager(String[] eventTypes){
        for(String evnt: eventTypes){
            assert this.SubscriberList != null;
            this.SubscriberList.put(evnt,new ArrayList<Listeners>());
        }
    }

    public void subscribe(String eventType,Listeners listener){
        List<Listeners> listeners1 = this.SubscriberList.get(eventType);
        listeners1.add(listener);
        System.out.println("subscrbed succesfully");
    }

    public void unsubscribe(String eventType, Listeners listener){
        List<Listeners> listeners1 = this.SubscriberList.get(eventType);
        listeners1.remove(eventType);
        System.out.println("unsubscrbed succesfully");
    }

    public void notify(String eventType,Match match){
        for(Listeners lis:this.SubscriberList.get(eventType)){
            lis.update(match);
            System.out.println("notified successfully ...");
        }
    }

}
