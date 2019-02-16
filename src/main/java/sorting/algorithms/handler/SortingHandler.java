package sorting.algorithms.handler;

import sorting.algorithms.bubblesort.BubbleSort;
import sorting.algorithms.insertionsort.InsertionSort;
import sorting.algorithms.mergesort.MergeSort;
import sorting.algorithms.quicksort.QuickSort;
import sorting.algorithms.selectionsort.SelectionSort;

public class SortingHandler {

    public static Object[] applyBubbleSortAscend(Comparable[] array){
        return new BubbleSort().applyBubbleSortAscend(array);
    }
    
    public static Object[] applyBubbleSortDescend(Comparable[] array){
        return new BubbleSort().applyBubbleSortDescend(array);
    }
    
    public static Object[] applyInsertionSortAscend(Comparable[] array){
        return new InsertionSort().applyInsertionSortAscend(array);
    }
    
    public static Object[] applyInsertionSortDescend(Comparable[] array){
        return new InsertionSort().applyInsertionSortDescend(array);
    }
    
    public static Object[] applyMergeSortAscend(Comparable[] array){
        return new MergeSort().applyMergeSortAscend(array);
    }
    
    public static Object[] applyMergeSortDescend(Comparable[] array){
        return new MergeSort().applyMergeSortDescend(array);
    }
    
    public static Object[] applySelectionSortAscend(Comparable[] array){
        return new SelectionSort().applySelectionSortAscend(array);
    }
    
    public static Object[] applySelectionSortDescend(Comparable[] array){
        return new SelectionSort().applySelectionSortAscend(array);
    }
    
    public static Object[] applyQuickSortAscend(Comparable[] array){
        return new QuickSort().applyQuickSortAscend(array);
    }
    
    public static Object[] applyQuickSortDescend(Comparable[] array){
        return new QuickSort().applyQuickSortAscend(array);
    }
    
}
