package ImpAdapter;

public class CreditService {
    
    private int creditCardNum;
    
    public CreditService(int creditCardNum){
        this.creditCardNum = creditCardNum;
    }
    
    public void payCredit(double amount){
        System.out.println("Pago de  " + amount + " realizando con Tarjeda de Crédito : #" + creditCardNum);
    }
    
}