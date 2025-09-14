package ImpFactoryMethod;

/*@author tosca*/

public class FactoryMain {

    public static void main(String[] args) {
        
        Creator pdfCreator = new ReportPDF(10);
        Report pdfReport = pdfCreator.createReport();
        pdfReport.generateReport("Datos de ventas R1");

        Creator excelCreator = new ReportExcel("A1:D10");
        Report excelReport = excelCreator.createReport();
        excelReport.generateReport("Datos financieros R2");

        Creator htmlCreator = new ReportHTML("ReporteWeb");
        Report htmlReport = htmlCreator.createReport();
        htmlReport.generateReport("Estadísticas R3");
        
    }
    
}