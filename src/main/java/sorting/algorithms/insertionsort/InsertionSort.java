package sorting.algorithms.insertionsort;

public class InsertionSort<T extends Comparable<T>> {

    public T[] applyInsertionSortAscend(T[] paramaterArray) {
        for (int i = 1; i < paramaterArray.length; i++) {
            T choosenElement = paramaterArray[i];
            int j = i - 1;
            while ((j >= 0)
                    && (paramaterArray[j].compareTo(choosenElement)) > 0) {
                paramaterArray[j + 1] = paramaterArray[j];
                j--;
            }
            paramaterArray[j + 1] = choosenElement;
        }

        return paramaterArray;
    }

    public T[] applyInsertionSortDescend(T[] parameterArray) {
        for (int i = 1; i < parameterArray.length; i++) {
            T choosenElement = parameterArray[i];
            int j = i - 1;
            while ((j >= 0)
                    && (parameterArray[j].compareTo(choosenElement)) < 0) {
                parameterArray[j + 1] = parameterArray[j];
                j--;
            }
            parameterArray[j + 1] = choosenElement;
        }

        return parameterArray;
    }

}
