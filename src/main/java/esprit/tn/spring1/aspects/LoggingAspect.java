package esprit.tn.spring1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Pointcut pour toutes les méthodes des services
    @Pointcut("execution(* esprit.tn.spring1.services.*.*(..))")
    public void serviceMethods() {}

    // Avant l'exécution
    @Before("serviceMethods()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[BEFORE] Méthode: " + joinPoint.getSignature().getName() +
                ", Arguments: " + java.util.Arrays.toString(joinPoint.getArgs()));
    }

    // Après l'exécution (success ou exception)
    @After("serviceMethods()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[AFTER] Méthode exécutée: " + joinPoint.getSignature().getName());
    }

    // Après le retour avec succès
    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("[AFTER RETURNING] Méthode: " + joinPoint.getSignature().getName() +
                ", Résultat: " + result);
    }

    // Si une exception est levée
    @AfterThrowing(pointcut = "serviceMethods()", throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        System.out.println("[AFTER THROWING] Méthode: " + joinPoint.getSignature().getName() +
                ", Exception: " + ex.getMessage());
    }

    // Autour de la méthode
    @Around("serviceMethods()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[AROUND] Avant exécution: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        System.out.println("[AROUND] Après exécution: " + joinPoint.getSignature().getName());
        return result;
    }
}
