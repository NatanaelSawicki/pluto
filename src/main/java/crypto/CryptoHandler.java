package crypto;

import enums.JulyMessageDigestEnum;
import customexceptions.JulyNoSuchAlgorithmException;
import exception.ExceptionHandler;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import string.StringHandler;

public class CryptoHandler {

    public static String applyMessageDigest(String in,
            JulyMessageDigestEnum pEnum)
            throws JulyNoSuchAlgorithmException {
        try {
            MessageDigest md = MessageDigest.getInstance(pEnum.getValue());
            md.update(in.getBytes());
            return StringHandler.stringHexa(md.digest());
        } catch (NoSuchAlgorithmException ex) {
            throw new JulyNoSuchAlgorithmException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public static String applyShift(String input,
            int shiftSize) {
        return encryptShift(input, shiftSize);
    }

    public static String removeShift(String input,
            int shiftSize) {
        return decryptShift(input, shiftSize);
    }

    private static String encryptShift(String input, int shift) {
        StringBuilder sb = new StringBuilder();

        for (int iterator = 0; iterator < input.length(); iterator++) {
            if (Character.isUpperCase(input.charAt(iterator))) {
                char c = (char) (((int) input.charAt(iterator)
                        + shift - 65) % 26 + 65);
                sb.append(c);
            } else {
                char c = (char) (((int) input.charAt(iterator)
                        + shift - 97) % 26 + 97);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static String decryptShift(String input,
            int shiftSize) {
        String inputP = input;
        StringBuilder sb = new StringBuilder();
        int key = shiftSize;
        char ch;
        for (int iterator = 0; iterator < inputP.length(); ++iterator) {
            ch = inputP.charAt(iterator);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - key);
                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }
                sb.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - key);

                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);
                }
                sb.append(ch);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
