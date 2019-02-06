package conditionals;

public class ConditionalHandler {

    public static boolean equalsTo(double a, double b){
        return a == b;
    }
    
    public static boolean equalsTo(long a, long b){
        return a == b;
    }
    
    public static boolean lesserThan(double a, double b){
        return a < b;
    }
    
    public static boolean lesserThan(long a, long b){
        return a < b;
    }
    
    public static boolean greaterThan(double a, double b){
        return a > b;
    }
    
    public static boolean greaterThan(long a, long b){
        return a > b;
    }
    
    public static boolean notEquals(double a, double b){
        return !equalsTo(a, b);
    }
    
    public static boolean notEquals(long a, long b){
        return !equalsTo(a, b);
    }
    
}
