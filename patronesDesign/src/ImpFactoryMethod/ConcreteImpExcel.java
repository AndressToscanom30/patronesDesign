package ImpFactoryMethod;

/*@author tosca*/

public class ConcreteImpExcel implements Report{
 
    private String rangeCells;
    
    public ConcreteImpExcel(String rangeCells){
        this.rangeCells = rangeCells;
    }
    
     @Override
    public void generateReport(String data) {
        System.out.println("Generando reporte Excel con rango " + rangeCells + ": " + data);
    }
    
    public void exporReport(){
        System.out.println("Exportando reporte en formato Excel...");
    }
    
}