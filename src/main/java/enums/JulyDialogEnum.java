package enums;

import javax.swing.JOptionPane;

public enum JulyDialogEnum {
    PLAIN_TEXT, QUESTION, INFORMATION, WARNING, ERROR,
    YES_OPTION, NO_OPTION, CANCEL_OPTION, YES_NO_CONFIRM,
    YES_NO_CANCEL_CONFIRM, DEFAULT_CONFIRM;
    
    public int getValue(){
        if(null != this)switch (this) {
            case QUESTION:
                return JOptionPane.QUESTION_MESSAGE;
            case INFORMATION:
                return JOptionPane.INFORMATION_MESSAGE;
            case PLAIN_TEXT:
                return JOptionPane.PLAIN_MESSAGE;
            case WARNING:
                return JOptionPane.WARNING_MESSAGE;
            case ERROR:
                return JOptionPane.ERROR_MESSAGE;
            case YES_OPTION:
                return JOptionPane.YES_OPTION;
            case NO_OPTION:
                return JOptionPane.NO_OPTION;
            case CANCEL_OPTION:
                return JOptionPane.CANCEL_OPTION;
            case YES_NO_CANCEL_CONFIRM:
                return JOptionPane.YES_NO_CANCEL_OPTION;
            case YES_NO_CONFIRM:
                return JOptionPane.YES_NO_OPTION;
            case DEFAULT_CONFIRM:
                return JOptionPane.DEFAULT_OPTION;
            default:
                break;
        }
        return -1;
    }
}
