package sorting.common;

import java.util.Random;

public class ArrayGenerator {

    public static Long[] generateLongArray(int arrayLengt) {
        if (arrayLengt == 0) {
            return null;
        }
        Long[] arrayReturn = new Long[arrayLengt];
        Random randomInstance = new Random();
        for (int i = 0; i < arrayReturn.length; i++) {
            arrayReturn[i] = randomInstance.nextLong();
        }
        return arrayReturn;
    }

    public static Double[] generateDoubleArray(int arraylength) {
        if (arraylength == 0) {
            return null;
        }
        Double[] arrayReturn = new Double[arraylength];
        Random randomInstance = new Random();
        for (int i = 0; i < arrayReturn.length; i++) {
            arrayReturn[i] = randomInstance.nextDouble();
        }
        return arrayReturn;
    }

}
