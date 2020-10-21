package org.exemple.proxy;

import org.exemple.dynamic.Login;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/7 23:06
 * @Description:
 */
public class UserServiceImpl implements UserService {


    public void register(User user) {
        System.out.println("userimpl registers");
    }

    @Login
    public boolean login(String name, String password) {
        System.out.println("userimpl login ");
        return true;
    }
}
