package report;

import exception.ExceptionHandler;
import customexceptions.JulyJasperReportException;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ReportHandler {

    // TODO implement JasperReport handler
    
    public static void showReport(String jasperReportLocation,
            Connection databaseConnection) 
            throws JulyJasperReportException{
        try {
            JasperPrint jasperReport = JasperFillManager.fillReport(jasperReportLocation, null, databaseConnection);
            JasperViewer jasperViewer = new JasperViewer(jasperReport);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            throw new JulyJasperReportException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
}
