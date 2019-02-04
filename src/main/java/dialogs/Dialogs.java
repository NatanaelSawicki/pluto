package dialogs;

import enums.PlutoDialogEnum;
import exception.ExceptionHandler;
import javax.swing.JOptionPane;
import sysutils.SystemHandler;

public class Dialogs {

    public static void showDialog(String dialogMessage){
        JOptionPane.showMessageDialog(null, dialogMessage);
    }
    
    public static void showDialog(String dialogMessage,
            String dialogTitle){
        JOptionPane.showMessageDialog(null, dialogMessage, dialogTitle, PlutoDialogEnum.INFORMATION.getValue());
    }
    
    public static void showDialog(String dialogMessage,
            String dialogTitle,
            PlutoDialogEnum dialogType){
        JOptionPane.showMessageDialog(null, dialogMessage, dialogTitle, dialogType.getValue());
    }
    
    public static boolean confirmDialog(String dialogMessage){
        return JOptionPane.showConfirmDialog(null, dialogMessage) == PlutoDialogEnum.YES_OPTION.getValue();
    }
    
    public static boolean confirmDialog(String dialogMessage,
            String dialogTitle){
        return JOptionPane.showConfirmDialog(null, dialogMessage, dialogTitle, PlutoDialogEnum.YES_NO_CONFIRM.getValue()) == PlutoDialogEnum.YES_OPTION.getValue();
    }
    
    public static boolean confirmDialog(String dialogMessage,
            String dialogTitle,
            PlutoDialogEnum dialogType){
        return JOptionPane.showConfirmDialog(null, dialogMessage, dialogTitle, dialogType.getValue()) == PlutoDialogEnum.YES_OPTION.getValue();
    }
    
    public static String inputDialog(String dialogMessage){
        return JOptionPane.showInputDialog(null, dialogMessage);
    }
    
    public static String inputDialog(String dialogMessage,
            String dialogTitle){
        return JOptionPane.showInputDialog(null, dialogMessage, dialogTitle, PlutoDialogEnum.QUESTION.getValue());
    }
    
    public static String inputDialog(String dialogMessage,
            String dialogTitle,
            PlutoDialogEnum dialogType){
        return JOptionPane.showInputDialog(null, dialogMessage, dialogTitle, dialogType.getValue());
    }
    
    public static void handleExceptionDialog(String errorMessage,
            Exception exception,
            boolean confirmToShowExceptionDetails,
            String confirmMessage,
            boolean abortSystem){
        
        if(confirmToShowExceptionDetails){
            if(confirmDialog(errorMessage.concat("\n").concat(confirmMessage),"Error")){
                showDialog(ExceptionHandler.getExceptionDetails(exception), "Error", PlutoDialogEnum.ERROR);
            }
        }else{
            showDialog(errorMessage, "Error", PlutoDialogEnum.ERROR);
        }
        
        if(abortSystem){
            SystemHandler.abortSystem(1);
        }
    }
}
