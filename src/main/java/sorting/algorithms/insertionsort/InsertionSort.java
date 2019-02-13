package sorting.algorithms.insertionsort;

public class InsertionSort {
    
    public static Long[] applyInsertionSortAscend(Long[] paramaterArray){
        for (int i = 1; i < paramaterArray.length; i++) {
            Long choosenElement = paramaterArray[i];
            int j = i - 1;
            while( (j >= 0) && 
                    (paramaterArray[j] > choosenElement)){
                paramaterArray[j+1] = paramaterArray[j];
                j--;
            }
            paramaterArray[j+1] = choosenElement;
        }
        
        return paramaterArray;
    }
    
    public static Long[] applyInsertionSortDescend(Long[] parameterArray){
        for (int i = 1; i < parameterArray.length; i++) {
            Long choosenElement = parameterArray[i];
            int j = i - 1;
            while( (j >= 0) && 
                    (parameterArray[j] < choosenElement)){
                parameterArray[j+1] = parameterArray[j];
                j--;
            }
            parameterArray[j+1] = choosenElement;
        }
        
        return parameterArray;
    }
    
    
    public static Double[] applyInsertionSortAscend(Double[] paramaterArray){
        for (int i = 1; i < paramaterArray.length; i++) {
            Double choosenElement = paramaterArray[i];
            int j = i - 1;
            while( (j >= 0) && 
                    (paramaterArray[j] > choosenElement)){
                paramaterArray[j+1] = paramaterArray[j];
                j--;
            }
            paramaterArray[j+1] = choosenElement;
        }
        
        return paramaterArray;
    }
    
    public static Double[] applyInsertionSortDescend(Double[] parameterArray){
        for (int i = 1; i < parameterArray.length; i++) {
            Double choosenElement = parameterArray[i];
            int j = i - 1;
            while( (j >= 0) && 
                    (parameterArray[j] < choosenElement)){
                parameterArray[j+1] = parameterArray[j];
                j--;
            }
            parameterArray[j+1] = choosenElement;
        }
        
        return parameterArray;
    }
    
    
}
