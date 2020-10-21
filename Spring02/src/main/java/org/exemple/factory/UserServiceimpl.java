package org.exemple.factory;

import org.exemple.proxy.User;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/10 19:49
 * @Description:
 */
public class UserServiceimpl implements UserService {

    public void login(String name, String password) {
        System.out.println("login");
    }

    public void register(User user) {
        System.out.println("register");
    }
}
