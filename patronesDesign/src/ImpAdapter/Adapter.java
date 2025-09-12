package ImpAdapter;

public class Adapter implements Payment{
    
    private PayPalService paypal;
    private CryptoService crypto;
    private CreditService credit;
    private String type;
    
    public Adapter(String type, int id){
        this.type = type.toUpperCase();
        
        switch(this.type){
            case "PAYPAL":
                paypal = new PayPalService(id);
                break;
            
            case "CRYPTO":
                crypto = new CryptoService(id);
                break;
            
            case "CREDIT":
                credit = new CreditService(id);
                break;
                
            default:
                throw new IllegalArgumentException("Método de pago no soportado");
        }
    }
    
    @Override
    public void paymentMethod(double amount){
        switch (type) {
            case "PAYPAL":
                paypal.payPayPal(amount);
                break;
                
            case "CRYPTO":
                crypto.payCrypto(amount);
                break;
                
            case "CREDIT":
                credit.payCredit(amount);
                break;
                
            default:
                System.out.println("❌ Error: método de pago no soportado");
        }
    }
    
}