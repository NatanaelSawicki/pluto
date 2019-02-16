package searching.algorithms.binarysearch;

public class BinarySearcher {

    public static boolean whileContains(int[] parameterArray, int elementToBeSearched) {
        if (parameterArray.length == 0) {
            return false;
        }
        int firstPosition = 0;
        int lastPosition = parameterArray.length - 1;
        while (firstPosition <= lastPosition) {
            int middle = (firstPosition + lastPosition) / 2;
            if (parameterArray[middle] == elementToBeSearched) {
                return true;
            }
            if (elementToBeSearched < parameterArray[middle]) {
                lastPosition--;
            } else {
                firstPosition++;
            }
        }
        return false;
    }

    public static boolean recursiveContains(int[] parameterArray,
            int elementToBeSearched,
            int firstPosition,
            int lastPostion) {
        int middlePosition = (firstPosition + lastPostion) / 2;
        if (parameterArray[middlePosition] == elementToBeSearched) {
            return true;
        } else if (firstPosition >= middlePosition) {
            return false;
        } else if (elementToBeSearched < parameterArray[middlePosition]) {
            return recursiveContains(parameterArray, elementToBeSearched, firstPosition, middlePosition--);
        } else {
            return recursiveContains(parameterArray, elementToBeSearched, middlePosition++, lastPostion);
        }
    }

}
