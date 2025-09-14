package ImpFactoryMethod;

/*@author tosca*/

public class ReportHTML extends Creator{
 
    private String name;
    
    public ReportHTML(String name) {
        this.name = name;
    }

    @Override
    public Report createReport() {
        return new ConcreteImpHTML(name);
    }
    
}