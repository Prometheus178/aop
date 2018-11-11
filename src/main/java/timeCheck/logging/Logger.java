package timeCheck.logging;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
    public Object watchTime(ProceedingJoinPoint joinPoint) {
        Long start = System.currentTimeMillis();
        System.out.println("method begin: " + joinPoint.getSignature().toShortString());
        Object outPut= null;
        try {
            outPut = joinPoint.proceed();
        } catch (Throwable e){
            e.printStackTrace();
        }

        Long time = System.currentTimeMillis();
        System.out.println("method end: " + joinPoint.getSignature().toShortString() + "time= "  + time + " ms");
        return outPut;
    }
}