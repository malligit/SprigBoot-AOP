package com.malli.aop;


import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SetterMonitor {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Before("execution(void com.malli.vo.*.set*(*))")
    public void callVOSetters(JoinPoint joinPoint) {
        System.out.println("####################Setter Called");
        System.out.println("#######################Method Invoked: " + joinPoint.getSignature().getName());
        System.out.println("###########################Value Passed: " + joinPoint.getArgs()[0]);
    }
    
    @Before("execution(void com.malli.pojo.*.set*(*))")
    public void callPOJOSetters(JoinPoint joinPoint) {
        System.out.println("@@@@@@@@@@@@@Setter Called");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@Method Invoked: " + joinPoint.getSignature().getName());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@Value Passed: " + joinPoint.getArgs()[0]);
    }
}