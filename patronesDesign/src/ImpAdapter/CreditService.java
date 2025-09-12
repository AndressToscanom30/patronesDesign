/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImpAdapter;

/**
 *
 * @author tosca
 */
public class CreditService {
    
    private int creditCardNum;
    
    public CreditService(int creditCardNum){
        this.creditCardNum = creditCardNum;
    }
    
    public void payCredit(double amount){
        System.out.println("Pago de  " + amount + " realizando con Tarjeda de Crédito : #" + creditCardNum);
    }
    
}
