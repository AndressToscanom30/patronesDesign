package ImpAdapter;

public class CryptoService {
    
    private int idWallet;
    
    public CryptoService(int idWallet){
        this.idWallet = idWallet;
    }
    
    public void payCrypto(double amount){
        System.out.println("Pago de " + amount + "USD realizado con crypto (Wallet ID: " + idWallet + ")");
    }
    
}