package sorting.algorithms.mergesort;

public class MergeSort<T extends Comparable<T>> {

    private T[] arrayGeneric;
    
    private void applyMergeAscend(T[] array,
            int initialPos,
            int middlePos,
            int lastPos) {

        T[] auxArray;
        auxArray = (T[]) new Comparable[array.length];
        for (int i = initialPos; i <= lastPos; i++) {
            auxArray[i] = array[i];
        }

        int firstIndexAux = initialPos;
        int middleIndexAux = middlePos + 1;
        int lastIndexAux = initialPos;

        while (firstIndexAux <= middlePos
                && middleIndexAux <= lastPos) {
            if (auxArray[firstIndexAux].compareTo(auxArray[middleIndexAux]) < 0) {
                array[lastIndexAux] = auxArray[firstIndexAux];
                firstIndexAux++;
            } else {
                array[lastIndexAux] = auxArray[middleIndexAux];
                middleIndexAux++;
            }
            lastIndexAux++;
        }

        while (firstIndexAux <= middlePos) {
            array[lastIndexAux] = auxArray[firstIndexAux];
            firstIndexAux++;
            lastIndexAux++;
        }

        while (middleIndexAux <= lastPos) {
            array[lastIndexAux] = auxArray[middleIndexAux];
            middleIndexAux++;
            lastIndexAux++;
        }

    }

    private void applyMergeDescend(T[] array,
            int initialPos,
            int middlePos,
            int lastPos) {

        T[] auxArray;
        auxArray = (T[]) new Comparable[array.length];
        for (int i = initialPos; i <= lastPos; i++) {
            auxArray[i] = array[i];
        }

        int firstIndexAux = initialPos;
        int middleIndexAux = middlePos + 1;
        int lastIndexAux = initialPos;

        while (firstIndexAux <= middlePos
                && middleIndexAux <= lastPos) {
            if (auxArray[firstIndexAux].compareTo(auxArray[middleIndexAux]) > 0) {
                array[lastIndexAux] = auxArray[firstIndexAux];
                firstIndexAux++;
            } else {
                array[lastIndexAux] = auxArray[middleIndexAux];
                middleIndexAux++;
            }
            lastIndexAux++;
        }

        while (firstIndexAux <= middlePos) {
            array[lastIndexAux] = auxArray[firstIndexAux];
            firstIndexAux++;
            lastIndexAux++;
        }

        while (middleIndexAux <= lastPos) {
            array[lastIndexAux] = auxArray[middleIndexAux];
            middleIndexAux++;
            lastIndexAux++;
        }

    }

    private void applySortAscend(T[] array,
            int firstPosition,
            int lastPosition) {

        if (array != null
                && array.length > 0
                && firstPosition < lastPosition
                && firstPosition >= 0
                && lastPosition <= array.length) {
            int middlePosition = (firstPosition + lastPosition) / 2;
            applySortAscend(array, firstPosition, middlePosition);
            applySortAscend(array, middlePosition + 1, lastPosition);
            applyMergeAscend(array, firstPosition, middlePosition, lastPosition);
            arrayGeneric = array;
        }

    }

    private void applySortDescend(T[] array,
            int firstPosition,
            int lastPosition) {

        if (array != null
                && array.length > 0
                && firstPosition < lastPosition
                && firstPosition >= 0
                && lastPosition <= array.length) {
            int middlePosition = (firstPosition + lastPosition) / 2;
            applySortDescend(array, firstPosition, middlePosition);
            applySortDescend(array, middlePosition + 1, lastPosition);
            applyMergeDescend(array, firstPosition, middlePosition, lastPosition);
            arrayGeneric = array;
        }

    }

    public T[] applyMergeSortAscend(T[] array) {
        applySortAscend(array, 0, array.length - 1);
        return arrayGeneric;
    }

    public T[] applyMergeSortDescend(T[] array) {
        applySortDescend(array, 0, array.length - 1);
        return arrayGeneric;
    }

}
