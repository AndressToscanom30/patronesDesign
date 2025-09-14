package ImpFactoryMethod;

/*@author tosca*/

public class ConcreteImpPDF implements Report{
 
    private int numPages;
    
    public ConcreteImpPDF(int numPages){
        this.numPages = numPages;
    }
    
    @Override
    public void generateReport(String data) {
        System.out.println("Generando reporte PDF con " + numPages + " páginas: " + data);
    }
    
    public void exportReport(){
        System.out.println("Exportando reporte en formato PDF...");
    }
}