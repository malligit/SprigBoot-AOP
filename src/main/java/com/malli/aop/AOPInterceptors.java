package com.malli.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.malli.vo.User;

@Aspect
@Component
public class AOPInterceptors {
	@Autowired
	User user; 
	
/*	@Around("execution(* com.malli.vo.User.getEmail())")
	public void interceptgetEmail(ProceedingJoinPoint joinPoint) throws Throwable {		
		System.out.println("inside Arround Interceptor");
			
		
	}
	*/
   @AfterReturning(
		      pointcut = "execution(String com.malli.vo.User.getEmail())",
		      returning= "result")
   public void logAfterReturning(JoinPoint joinPoint, Object result) {

	System.out.println("logAfterReturning() is running!");
	System.out.println("hijacked : " + joinPoint.getSignature().getName());
	System.out.println("Method returned value is : " + result);
	if (result == null)
		user.setEmail("mallionnet@gmail.com");
	
	   }

}
