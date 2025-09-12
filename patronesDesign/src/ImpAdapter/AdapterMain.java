package ImpAdapter;

public class AdapterMain {

    public static void main(String[] args) {
    
        Payment paypal = new Adapter("PAYPAL", 101);
        paypal.paymentMethod(120.43);
        
        Payment crypto = new Adapter("CRYPTO", 555);
        crypto.paymentMethod(12.40);
        
        Payment credit = new Adapter("CREDIT", 242);
        credit.paymentMethod(44.03);
        
    }
    
}