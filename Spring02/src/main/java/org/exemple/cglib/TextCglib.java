package org.exemple.cglib;

import org.exemple.proxy.User;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/10 19:21
 * @Description:
 */
public class TextCglib {
    public static void main(String[] args) {
        final UserService userService = new UserService();
        //通过cglib方式创建动态代理对象
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(userService.getClass().getClassLoader());
        enhancer.setSuperclass(userService.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("log");
                Object invoke = method.invoke(userService, objects);
                return invoke;
            }
        });

        UserService o = (UserService)enhancer.create();
        o.register(new User());
    }
}
