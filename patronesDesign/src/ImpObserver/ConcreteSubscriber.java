package ImpObserver;

public class ConcreteSubscriber implements Subscriber {
 
    private Client client;
    
    public ConcreteSubscriber(Client client){
        this.client = client;
    }
    
    @Override
    public void updateContent(String context){
        System.out.println("Cliente " + client.getIdClient() + " recibió notificación: " + context);
    }
    
}