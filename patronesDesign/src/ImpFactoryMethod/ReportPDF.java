package ImpFactoryMethod;

/*@author tosca*/

public class ReportPDF extends Creator{
 
    private int pages;
    
    public ReportPDF(int pages){
        this.pages = pages;
    }
    
    @Override 
    public Report createReport(){
        return new ConcreteImpPDF(pages);
    }
    
}