package invokemethod;

import customexceptions.PlutoIllegalAccessException;
import customexceptions.PlutoIllegalArgumentException;
import customexceptions.PlutoInvocationTargetException;
import customexceptions.PlutoNoSuchMethodException;
import customexceptions.PlutoNullPointerException;
import customexceptions.PlutoSecurityException;
import exception.ExceptionHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodHandler {

    public static Object invoke(Object methodTarget,
            Class methodClass,
            String methodName,
            Object... methodArguments) 
            throws PlutoNoSuchMethodException, 
            PlutoSecurityException, 
            PlutoIllegalAccessException, 
            PlutoIllegalArgumentException, 
            PlutoInvocationTargetException, 
            PlutoNullPointerException {
        try {
            if (methodArguments == null) {
                Method method = methodClass.getDeclaredMethod(methodName);
                return method.invoke(methodTarget);
            } else {
                Method method = methodClass.getDeclaredMethod(methodName, 
                        methodArguments.getClass());
                return method.invoke(methodTarget, 
                        methodArguments);
            }

        } catch (NoSuchMethodException ex) {
            throw new PlutoNoSuchMethodException(ExceptionHandler.getExceptionDetails(ex));
        } catch (SecurityException ex) {
            throw new PlutoSecurityException(ExceptionHandler.getExceptionDetails(ex));
        } catch (IllegalAccessException ex) {
            throw new PlutoIllegalAccessException(ExceptionHandler.getExceptionDetails(ex));
        } catch (IllegalArgumentException ex) {
            throw new PlutoIllegalArgumentException(ExceptionHandler.getExceptionDetails(ex));
        } catch (InvocationTargetException ex) {
            throw new PlutoInvocationTargetException(ExceptionHandler.getExceptionDetails(ex));
        } catch (NullPointerException ex) {
            throw new PlutoNullPointerException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public static void invokeNoReturn(Object methodTarget,
            Class methodClass,
            String methodName,
            Object... methodArguments) 
            throws PlutoNoSuchMethodException, 
            PlutoSecurityException, 
            PlutoIllegalAccessException, 
            PlutoIllegalArgumentException, 
            PlutoInvocationTargetException,
            PlutoNullPointerException{
        try {
            if (methodArguments == null) {
                Method method = methodClass.getDeclaredMethod(methodName);
                method.invoke(methodTarget);
            } else {
                Method method = methodClass.getDeclaredMethod(methodName, 
                        methodArguments.getClass());
                method.invoke(methodTarget, 
                        methodArguments);
            }

        } catch (NoSuchMethodException ex) {
            throw new PlutoNoSuchMethodException(ExceptionHandler.getExceptionDetails(ex));
        } catch (SecurityException ex) {
            throw new PlutoSecurityException(ExceptionHandler.getExceptionDetails(ex));
        } catch (IllegalAccessException ex) {
            throw new PlutoIllegalAccessException(ExceptionHandler.getExceptionDetails(ex));
        } catch (IllegalArgumentException ex) {
            throw new PlutoIllegalArgumentException(ExceptionHandler.getExceptionDetails(ex));
        } catch (InvocationTargetException ex) {
            throw new PlutoInvocationTargetException(ExceptionHandler.getExceptionDetails(ex));
        } catch (NullPointerException ex) {
            throw new PlutoNullPointerException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

}
