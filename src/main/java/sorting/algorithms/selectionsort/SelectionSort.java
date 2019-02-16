package sorting.algorithms.selectionsort;

public class SelectionSort<T extends Comparable<T>> {

    public T[] applySelectionSortAscend(T[] parameterArray) {
        for (int i = 0; i < parameterArray.length; i++) {
            int lesserPosition = i;
            for (int j = i; j < parameterArray.length; j++) {
                if (parameterArray[j].compareTo(parameterArray[lesserPosition]) < 0) {
                    lesserPosition = j;
                }
            }
            T temporarySwapVariable = parameterArray[i];
            parameterArray[i] = parameterArray[lesserPosition];
            parameterArray[lesserPosition] = temporarySwapVariable;
        }
        return parameterArray;
    }

    public T[] applySelectionSortDescend(T[] parameterArray) {
        for (int i = 0; i < parameterArray.length; i++) {
            int greaterPosition = i;
            for (int j = i; j < parameterArray.length; j++) {
                if (parameterArray[j].compareTo(parameterArray[greaterPosition]) > 0) {
                    greaterPosition = j;
                }
            }
            T temporarySwapVariable = parameterArray[i];
            parameterArray[i] = parameterArray[greaterPosition];
            parameterArray[greaterPosition] = temporarySwapVariable;
        }
        return parameterArray;
    }
    
}
