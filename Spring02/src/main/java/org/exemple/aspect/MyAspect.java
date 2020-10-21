package org.exemple.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/10 21:19
 * @Description:
 */
/*
1. 额外功能
2.切入点
 */
@Aspect
public class MyAspect {
    @Pointcut("execution(* org.exemple.aspect.UserServiceimpl.*(..))")
    public void myPointCut(){

    }
    //和实现methodinterceptor作用一致 利用注解相当于实现接口
    @Around(value ="myPointCut()")
    public Object arround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("log");
        Object proceed = joinPoint.proceed();

        return proceed;
    }
    @Around(value = "myPointCut()")
    public Object arround1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("transaction");
        Object proceed = joinPoint.proceed();

        return proceed;
    }
}
