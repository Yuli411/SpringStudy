package org.exemple.jdk;

import org.exemple.proxy.User;
import org.exemple.proxy.UserService;
import org.exemple.proxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/9 16:19
 * @Description:
 */
public class TestJdkProxy {
    public static void main(String[] args){
        final UserService userService = new UserServiceImpl();
        UserService proxyInstance = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            //proxy代表代理对象 method是原始方法 args是原始方法的参数
            //接用类加载器 可以随便接用任意类
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("log");
                Object invoke = method.invoke(userService, args);
                return invoke;
            }
        });

        proxyInstance.register(new User());

    }


}
