package ImpFactoryMethod;

/**
 *
 * @author tosca
 */
public class ReportExcel extends Creator{
    
    private String rangeCells;

    public ReportExcel(String rangeCells) {
        this.rangeCells = rangeCells;
    }

    @Override
    public Report createReport() {
        return new ConcreteImpExcel(rangeCells);
    }
    
}
