package dialogs;

import enums.JulyDialogEnum;
import exception.ExceptionHandler;
import javax.swing.JOptionPane;
import sysutils.SystemHandler;

public class Dialogs {

    public static void showDialog(String dialogMessage){
        JOptionPane.showMessageDialog(null, dialogMessage);
    }
    
    public static void showDialog(String dialogMessage,
            String dialogTitle){
        JOptionPane.showMessageDialog(null, dialogMessage, dialogTitle, JulyDialogEnum.INFORMATION.getValue());
    }
    
    public static void showDialog(String dialogMessage,
            String dialogTitle,
            JulyDialogEnum dialogType){
        JOptionPane.showMessageDialog(null, dialogMessage, dialogTitle, dialogType.getValue());
    }
    
    public static boolean confirmDialog(String dialogMessage){
        return JOptionPane.showConfirmDialog(null, dialogMessage) == JulyDialogEnum.YES_OPTION.getValue();
    }
    
    public static boolean confirmDialog(String dialogMessage,
            String dialogTitle){
        return JOptionPane.showConfirmDialog(null, dialogMessage, dialogTitle, JulyDialogEnum.YES_NO_CONFIRM.getValue()) == JulyDialogEnum.YES_OPTION.getValue();
    }
    
    public static boolean confirmDialog(String dialogMessage,
            String dialogTitle,
            JulyDialogEnum dialogType){
        return JOptionPane.showConfirmDialog(null, dialogMessage, dialogTitle, dialogType.getValue()) == JulyDialogEnum.YES_OPTION.getValue();
    }
    
    public static String inputDialog(String dialogMessage){
        return JOptionPane.showInputDialog(null, dialogMessage);
    }
    
    public static String inputDialog(String dialogMessage,
            String dialogTitle){
        return JOptionPane.showInputDialog(null, dialogMessage, dialogTitle, JulyDialogEnum.QUESTION.getValue());
    }
    
    public static String inputDialog(String dialogMessage,
            String dialogTitle,
            JulyDialogEnum dialogType){
        return JOptionPane.showInputDialog(null, dialogMessage, dialogTitle, dialogType.getValue());
    }
    
    public static void handleExceptionDialog(String errorMessage,
            Exception exception,
            boolean confirmToShowExceptionDetails,
            String confirmMessage,
            boolean abortSystem){
        
        if(confirmToShowExceptionDetails){
            if(confirmDialog(errorMessage.concat("\n").concat(confirmMessage),"Error")){
                showDialog(ExceptionHandler.getExceptionDetails(exception), "Error", JulyDialogEnum.ERROR);
            }
        }else{
            showDialog(errorMessage, "Error", JulyDialogEnum.ERROR);
        }
        
        if(abortSystem){
            SystemHandler.abortSystem(1);
        }
    }
}
