package string;

public class StringHandler {

    public static long countOccurrencesOf(String textToLookFor,
            String text) {
        long occurrences = 0;
        String auxiliarVariable = text;
        while (auxiliarVariable.contains(textToLookFor)) {
            auxiliarVariable = auxiliarVariable.replaceFirst(textToLookFor, "");
            occurrences++;
        }
        return occurrences;
    }

    public static String joinString(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (String iterator : array) {
            sb.append(iterator);
        }
        return sb.toString();
    }

    public static String reverseString(String reverseTarget) {
        String returnVariable = "";

        for (int iterator = reverseTarget.length() - 1; iterator >= 0; iterator--) {
            returnVariable += stringFromChar(reverseTarget.charAt(iterator));
        }

        return returnVariable;
    }

    public static String stringFromChar(char parameterChar) {
        return "" + parameterChar;
    }

    public static String stringFromCharArray(char[] parameterArray) {
        String returnValue = "";

        for (char iterator : parameterArray) {
            returnValue += iterator;
        }

        return returnValue;
    }

    public static String stringHexa(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            int high = ((bytes[i] >> 4) & 0xf) << 4;
            int low = bytes[i] & 0xf;
            if (high == 0) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(high | low));
        }
        return sb.toString();
    }
    
    public static String replaceAll(String source, 
            String from,
            String to){
        String ret = source;
        while(ret.contains(from)){
            ret = ret.replace(from, to);
        }
        return ret;
    }

}
