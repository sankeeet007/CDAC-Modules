package in.cdac.SpringBootAOP.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UsersAspect {
	
	@Before("execution(public * in.cdac.SpringBootAOP.services.UsersServiceImpl.authenticate(..))")
	public void logUserActivity(JoinPoint point) {
		System.out.println("The authenticate method of UserServiceImpl is Fired....");
	}
	
	@After("execution(public * in.cdac.SpringBootAOP.services.UsersServiceImpl.authenticate(..))") 
	public void logUserAfterActivity(JoinPoint point) {
		System.out.println("After effect is Fired....");
	}
}
