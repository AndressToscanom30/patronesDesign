package ImpAdapter;

public class PayPalService {
    
    private int idAccount;
    
    public PayPalService(int idAccount){
        this.idAccount = idAccount;
    }
    
    public void payPayPal(double amount){
        System.out.println("Pago de " + amount + "USD a través de  la cuenta de PayPal: " + idAccount);
    }
    
    
}
