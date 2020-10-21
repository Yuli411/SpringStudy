package org.exemple.aspect;

import org.exemple.proxy.User;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/10 19:48
 * @Description:
 */
public interface UserService {
    public void login(String name, String password);
    public void register(User user);
}
