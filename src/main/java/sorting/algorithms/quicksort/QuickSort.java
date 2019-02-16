package sorting.algorithms.quicksort;

public class QuickSort<T extends Comparable<T>> {

    public T[] applyQuickSortAscend(T[] array) {
        return applySortAscend(array, 0, array.length - 1);
    }

    private T[] applySortAscend(T[] array,
            int initialPosition,
            int lastPosition) {

        int initialAux = initialPosition;
        int lastAux = lastPosition;
        T middleAux = array[(initialPosition + lastPosition) / 2];

        while (initialAux <= lastAux) {
            while (array[initialAux].compareTo(middleAux) < 0) {
                initialAux++;
            }
            while (array[lastAux].compareTo(middleAux) > 0) {
                lastAux--;
            }
            if (initialAux <= lastAux) {
                T auxiliarSwap = array[initialAux];
                array[initialAux] = array[lastAux];
                array[lastAux] = auxiliarSwap;
                initialAux++;
                lastAux--;
            }
        }
        if (initialPosition < lastAux) {
            applySortAscend(array, initialPosition, lastAux);
        }
        if (initialAux < lastPosition) {
            applySortAscend(array, initialAux, lastPosition);
        }
        return array;
    }

    public T[] applyQuickSortDescend(T[] array) {
        return applySortDescend(array, 0, array.length - 1);
    }

    private T[] applySortDescend(T[] array,
            int initialPosition,
            int lastPosition) {

        int initialAux = initialPosition;
        int lastAux = lastPosition;
        T middleAux = array[(initialPosition + lastPosition) / 2];

        while (initialAux <= lastAux) {
            while (array[initialAux].compareTo(middleAux) > 0) {
                initialAux++;
            }
            while (array[lastAux].compareTo(middleAux) < 0) {
                lastAux--;
            }
            if (initialAux <= lastAux) {
                T auxiliarSwap = array[initialAux];
                array[initialAux] = array[lastAux];
                array[lastAux] = auxiliarSwap;
                initialAux++;
                lastAux--;
            }
        }
        if (initialPosition < lastAux) {
            applySortDescend(array, initialPosition, lastAux);
        }
        if (initialAux < lastPosition) {
            applySortDescend(array, initialAux, lastPosition);
        }
        return array;
    }

}
