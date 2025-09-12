package ImpObserver;

/*@author tosca*/

public class ObserverMain {

    public static void main(String[] args) {
    
        Publisher p = new Publisher();
        
        Client c1 = new Client(1);
        Client c2 = new Client(2);
        
        Subscriber sub1 = new ConcreteSubscriber(c1);
        Subscriber sub2 = new ConcreteSubscriber(c2);
        
        p.subscribe(sub1);
        p.subscribe(sub2);
        
        p.createAlert("Se ha realizado un pago");
        p.createAlert("Saldo bajo en la cuenta");
        
        p.unsubcribe(sub1);
        
        p.createAlert("¡Nueva promoción disponible!");
        
    }
    
}