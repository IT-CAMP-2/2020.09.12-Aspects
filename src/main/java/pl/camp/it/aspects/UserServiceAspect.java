package pl.camp.it.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import pl.camp.it.model.User;

@Aspect
@Component
public class UserServiceAspect {

    @Pointcut("execution(pl.camp.it.model.User pl.camp.it.services.impl.UserServiceImpl.getUser1())")
    public void getUser1Pointcut() {}

    @Pointcut("execution(* pl.camp.it.services.impl.UserServiceImpl.*(..))")
    public void getAllUsersPointcut() {}

    @Pointcut("within(pl.camp.it.services.impl.UserServiceImpl)")
    public void getAllUsersPointcut2() {}

    @Pointcut("target(pl.camp.it.services.IUserService)")
    public void getAllUsersInterfacePointcut() {}

    @Pointcut("within(pl.camp.it.services.impl.*)")
    public void getAllUsersInterfacePointcut2() {}

    @Before("getAllUsersInterfacePointcut2()")
    public void printGetUser1Info() {
        System.out.println("Zaraz wykona się pobranie User1 !!");
    }

    @After("getAllUsersInterfacePointcut()")
    public void printGetUser1Success() {
        System.out.println("Pobieranie Usera1 zakończone powodzeniem !!");
    }

    @AfterReturning(pointcut = "getUser1Pointcut()", returning = "value")
    public void afterReturning(User value) {
        System.out.println("Zakończono zwracanie wartości !!");
        System.out.println(value.getLogin());
    }

    @Around("getUser1Pointcut()")
    public Object duringMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Startuje around !!");
        Object result = joinPoint.proceed();
        if(result instanceof User) {
            User user = (User) result;
            user.setId(10);
        }
        System.out.println("Kończy się around !!");
        return result;
    }
}
