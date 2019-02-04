package invokemethod;

import customexceptions.JulyIllegalAccessException;
import customexceptions.JulyIllegalArgumentException;
import customexceptions.JulyInvocationTargetException;
import customexceptions.JulyNoSuchMethodException;
import customexceptions.JulyNullPointerException;
import customexceptions.JulySecurityException;
import exception.ExceptionHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodHandler {

    public static Object invoke(Object methodTarget,
            Class methodClass,
            String methodName,
            Object... methodArguments) 
            throws JulyNoSuchMethodException, 
            JulySecurityException, 
            JulyIllegalAccessException, 
            JulyIllegalArgumentException, 
            JulyInvocationTargetException, 
            JulyNullPointerException {
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
            throw new JulyNoSuchMethodException(ExceptionHandler.getExceptionDetails(ex));
        } catch (SecurityException ex) {
            throw new JulySecurityException(ExceptionHandler.getExceptionDetails(ex));
        } catch (IllegalAccessException ex) {
            throw new JulyIllegalAccessException(ExceptionHandler.getExceptionDetails(ex));
        } catch (IllegalArgumentException ex) {
            throw new JulyIllegalArgumentException(ExceptionHandler.getExceptionDetails(ex));
        } catch (InvocationTargetException ex) {
            throw new JulyInvocationTargetException(ExceptionHandler.getExceptionDetails(ex));
        } catch (NullPointerException ex) {
            throw new JulyNullPointerException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public static void invokeNoReturn(Object methodTarget,
            Class methodClass,
            String methodName,
            Object... methodArguments) 
            throws JulyNoSuchMethodException, 
            JulySecurityException, 
            JulyIllegalAccessException, 
            JulyIllegalArgumentException, 
            JulyInvocationTargetException,
            JulyNullPointerException{
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
            throw new JulyNoSuchMethodException(ExceptionHandler.getExceptionDetails(ex));
        } catch (SecurityException ex) {
            throw new JulySecurityException(ExceptionHandler.getExceptionDetails(ex));
        } catch (IllegalAccessException ex) {
            throw new JulyIllegalAccessException(ExceptionHandler.getExceptionDetails(ex));
        } catch (IllegalArgumentException ex) {
            throw new JulyIllegalArgumentException(ExceptionHandler.getExceptionDetails(ex));
        } catch (InvocationTargetException ex) {
            throw new JulyInvocationTargetException(ExceptionHandler.getExceptionDetails(ex));
        } catch (NullPointerException ex) {
            throw new JulyNullPointerException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

}
