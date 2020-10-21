package org.exemple.cglib;

import org.exemple.proxy.User;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/10 19:20
 * @Description:
 */
public class UserService {
    public void login(String name,String password){
        System.out.println("login");
    }
    public void register(User user){
        System.out.println("register");
    }
}
