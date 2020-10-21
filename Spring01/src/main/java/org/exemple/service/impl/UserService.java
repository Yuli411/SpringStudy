package org.exemple.service.impl;

import org.exemple.dao.impl.UserDao;
import org.exemple.dao.impl.UserDaoImpl;
import org.exemple.pojo.User;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/2 15:48
 * @Description:
 */
public interface UserService {
    public void login(String name,String password);
    public void register(User user);
}
