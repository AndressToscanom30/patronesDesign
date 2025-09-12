package ImpObserver;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Subscriber> subscribers = new ArrayList<>();
    
    public void subscribe(Subscriber s){
        subscribers.add(s);
    }
    
    public void unsubcribe(Subscriber s){
        subscribers.remove(s);
    }
    
    public void notifySubscribers(String context){
        for (Subscriber s : subscribers){
            s.updateContent(context);
        }
    }
    
    public void createAlert(String message){
        System.out.println("Alerta creada para: " + message);
        notifySubscribers(message);
    }
    
}