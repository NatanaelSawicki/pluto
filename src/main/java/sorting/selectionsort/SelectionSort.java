package sorting.selectionsort;

public class SelectionSort {
    
    public static Long[] applySelectionSortAscend(Long[] parameterArray){
        for (int i = 0; i < parameterArray.length; i++) {
            int lesserPosition = i;
            for (int j = i; j < parameterArray.length; j++) {
                if(parameterArray[j] < parameterArray[lesserPosition]){
                    lesserPosition = j;
                }
            }
            long temporarySwapVariable = parameterArray[i];
            parameterArray[i] = parameterArray[lesserPosition];
            parameterArray[lesserPosition] = temporarySwapVariable;
        }
        return parameterArray;
    }
    
    public static Long[] applySelectionSortDescend(Long[] parameterArray){
        for (int i = 0; i < parameterArray.length; i++) {
            int greaterPosition = i;
            for (int j = i; j < parameterArray.length; j++) {
                if(parameterArray[j] > parameterArray[greaterPosition]){
                    greaterPosition = j;
                }
            }
            long temporarySwapVariable = parameterArray[i];
            parameterArray[i] = parameterArray[greaterPosition];
            parameterArray[greaterPosition] = temporarySwapVariable;
        }
        return parameterArray;
    }
    
    public static Double[] applySelectionSortAscend(Double[] parameterArray){
        for (int i = 0; i < parameterArray.length; i++) {
            int lesserPosition = i;
            for (int j = i; j < parameterArray.length; j++) {
                if(parameterArray[j] < parameterArray[lesserPosition]){
                    lesserPosition = j;
                }
            }
            Double temporarySwapVariable = parameterArray[i];
            parameterArray[i] = parameterArray[lesserPosition];
            parameterArray[lesserPosition] = temporarySwapVariable;
        }
        return parameterArray;
    }
    
    public static Double[] applySelectionSortDescend(Double[] parameterArray){
        for (int i = 0; i < parameterArray.length; i++) {
            int greaterPosition = i;
            for (int j = i; j < parameterArray.length; j++) {
                if(parameterArray[j] > parameterArray[greaterPosition]){
                    greaterPosition = j;
                }
            }
            Double temporarySwapVariable = parameterArray[i];
            parameterArray[i] = parameterArray[greaterPosition];
            parameterArray[greaterPosition] = temporarySwapVariable;
        }
        return parameterArray;
    }
    
}
