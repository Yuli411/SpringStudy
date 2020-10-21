package org.exemple.dynamic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/7 23:28
 * @Description:
 */

//methodbeforeadvice加入额外功能
public class Before implements MethodBeforeAdvice {
    //需要把运行在原始方法执行之间需要运行的额外功能写在before方法中
    /*
    method是原始方法 object数组是原始方法的参数 Object是原始对象
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("proxy");
    }
}
