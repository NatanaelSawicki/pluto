package random;

import java.util.Random;

public class RandomHandler {

    public static int randomizePositiveNumber(int max, boolean allowZero){
        Random randomizerBean = new Random();
        if(allowZero){
            int generatedNumber = randomizerBean.nextInt(max+1);
            while(generatedNumber > max ){
                generatedNumber = randomizerBean.nextInt(max+1);
            }
            return generatedNumber;
        }else{
            int generatedNumber = randomizerBean.nextInt(max+1);
            while(generatedNumber > max || generatedNumber == 0){
                generatedNumber = randomizerBean.nextInt(max+1);
            }
            return generatedNumber;
        }
    }
    
    public static long randomizeNumber(long max, boolean allowZero){
        Random randomizerBean = new Random();
        if(allowZero){
            long generatedNumber = randomizerBean.nextLong();
            while(generatedNumber > max ){
                generatedNumber = randomizerBean.nextLong();
            }
            return generatedNumber;
        }else{
            long generatedNumber = randomizerBean.nextLong();
            while(generatedNumber > max || generatedNumber == 0){
                generatedNumber = randomizerBean.nextLong();
            }
            return generatedNumber;
        }
    }
    
    public static int rollDN(int numberLimit, boolean allowZero){
        return randomizePositiveNumber(numberLimit, allowZero);
    }
    
    public static int rollD4(){
        return rollDN(4, false);
    }
    
    public static int rollD6(){
        return rollDN(6, false);
    }
    
    public static int rollD8(){
        return rollDN(8, false);
    }
    
    public static int rollD10(){
        return rollDN(10, false);
    }    

    public static int rollD12(){
        return rollDN(12, false);
    }
    
    public static int rollD20(){
        return rollDN(20, false);
    }
    
    public static int rollD100(){
        return rollDN(100, false);
    }
    
}
