package ImpFactoryMethod;

/*@author tosca*/

public class ConcreteImpHTML implements Report {
    
    private String name;

    public ConcreteImpHTML(String name) {
        this.name = name;
    }

    @Override
    public void generateReport(String data) {
        System.out.println("Generando reporte HTML con nombre " + name + ": " + data);
    }

    public void exportReport() {
        System.out.println("Exportando reporte en formato HTML...");
    }
}
