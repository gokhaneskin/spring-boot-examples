package com.gokhaneskin.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.gokhaneskin.aop.service.*.*(..))")
    public void getMessageBefore(JoinPoint joinPoint){
        System.out.println("Before: "+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.gokhaneskin.aop.service.*.*(..))")
    public void getMessageAfter(JoinPoint joinPoint){
        System.out.println("After: "+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
