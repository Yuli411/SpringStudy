package org.exemple.aspect;

import org.exemple.proxy.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/10 21:40
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext3.xml");
        org.exemple.aspect.UserService userService = (org.exemple.aspect.UserService) ca.getBean("userService");
        userService.register(new User());
        userService.login("123","12300");
    }
}
