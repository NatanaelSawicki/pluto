package math;

public class MathHandler {

    public static double abs(Double b){
        return Math.abs(b);
    }
    
    public static long abs(Long b){
        return Math.abs(b);
    }
    
    public static long addExact(long a, long b){
        return Math.addExact(a, b);
    }
    
    public static long decrementExact(long a){
        return Math.decrementExact(a);
    }
    
    public static double arcSin(double a){
        return Math.asin(a);
    }
    
    public static double arcTan(double a){
        return Math.atan(a);
    }
    
    public static double arcTan2(double a){
        return Math.atan(2);
    }
    
    public static double cubeRoot(double a){
        return Math.cbrt(a);
    }
    
    public static double numberCeil(double a){
        return Math.ceil(a);
    }
    
    public static double copySign(double a, double b){
        return Math.copySign(a, b);
    }
    
    public static double cosine(double a){
        return Math.cos(a);
    }
    
    public static double sin(double a){
        return Math.sin(a);
    }
    
    public static double tan(double a){
        return Math.tan(a);
    }
    
    public static double hyperbolicCosine(double a){
        return Math.cosh(a);
    }
    
    public static double expNumber(double a){
        return Math.exp(a);
    }
    
    public static double expNumberM1(double a){
        return Math.expm1(a);
    }
    
    public static double floor(double a){
        return Math.floor(a);
    }
    
    public static long floorDiv(long a, long b){
        return Math.floorDiv(a, b);
    }
    
    public static double floorMod(long a, long b){
        return Math.floorMod(a, b);
    }
    
    public static int getExponent(double a){
        return Math.getExponent(a);
    }
    
    public static int getExponent(long a){
        return Math.getExponent(a);
    }
    
    public static double hypot(double a, double b){
        return Math.hypot(b, b);
    }
    
    public static double remainderIeee(double a, double b){
        return Math.IEEEremainder(a, b);
    }
    
    public static long incrementExact(int a){
        return Math.incrementExact(a);
    }
    
    public static long incrementExact(long a){
        return Math.incrementExact(a);
    }
    
    public static double logNumber(double a){
        return Math.log(a);
    }
    
    public static double log10Number(double a){
        return Math.log10(a);
    }
    
    public static double logPNumber(double a){
        return Math.log1p(a);
    }
    
    public static double max(double a, double b){
        return Math.max(a, b);
    }
    
    public static long max(long a, long b){
        return Math.max(a, b);
    }
    
    public static double min(double a, double b){
        return Math.min(a, b);
    }
    
    public static long min(long a, long b){
        return Math.min(a, b);
    }
    
    public static long multiplyExact(long a, long b){
        return Math.multiplyExact(a, b);
    }
    
    public static long negateExact(long a){
        return Math.negateExact(a);
    }
    
    public static double nextAfter(double a, double b){
        return Math.nextAfter(a, b);
    }
    
    public static double nextUp(double a){
        return Math.nextUp(a);
    }
    
    public static double nextDown(double a){
        return Math.nextDown(a);
    }
    
    public static double power(double a, double b){
        return Math.pow(a, b);
    }
    
    public static double power2(double a){
        return power(a, 2);
    }
    
    public static long round(double a){
        return Math.round(a);
    }
    
    public static int round(float a){
        return Math.round(a);
    }
    
    public static double sqrt(double a){
        return Math.sqrt(a);
    }
    
    public static double sqrN(double a, double n){
        return power(a, 1/n);
    }
    
}
