package org.exemple.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/10 19:52
 * @Description:
 */
public class Proxy implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        if (bean instanceof UserService) {
            UserService userServiceProxy = (UserService) java.lang.reflect.Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("log");
                    Object invoke = method.invoke(bean, args);
                    return invoke;
                }
            });
            return userServiceProxy;
        }

        return bean;
    }
}
