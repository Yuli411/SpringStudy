package org.exemple.aspect;

import org.exemple.proxy.User;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/10 19:49
 * @Description:
 */
public class UserServiceimpl implements UserService, ApplicationContextAware {
    private ApplicationContext applicationContext;


    public void login(String name, String password) {
        System.out.println("login");
    }

    public void register(User user) {
        System.out.println("register");
        //此时调用的是原始对象的login方法 只能完成核心功能 不能执行额外功能
        //设计目的 获得代理对象的login方法
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.login("1230","123456");
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
