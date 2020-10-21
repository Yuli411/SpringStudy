package org.example.service;

import org.example.pojo.User;

/**
 * @Auther: Yhurri
 * @Date: 18/08/2020 12:49
 * @Description:
 */
public interface UserService {
    public void register(User user);
    public void login(String name, String password);
}
