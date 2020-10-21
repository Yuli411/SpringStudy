package org.exemple.dynamic;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/8 22:17
 * @Description:
 */

/*
invoke方法的作用 额外功能写在invoke
额外功能 原始方法之前
        原始方法之后
        原始方法之前，之后
       **确定 原始方法怎么运行
       参数 methodInvocation 代表原始方法
       返回值是原始方法返回值
 */
public class Arround implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("==log==");
        Object proceed = null;
        //l利用try catch捕获异常 案例 事务
        try {
            proceed = methodInvocation.proceed();
        }catch (Exception e){

            System.out.println("==log finish==");
        }
        return proceed;
    }
}
