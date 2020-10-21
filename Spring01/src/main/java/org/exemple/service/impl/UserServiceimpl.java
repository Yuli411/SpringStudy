package org.exemple.service.impl;

import org.exemple.dao.impl.UserDao;
import org.exemple.dao.impl.UserDaoImpl;
import org.exemple.pojo.BeanFactory;
import org.exemple.pojo.User;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/2 15:48
 * @Description:
 */
public class UserServiceimpl implements UserService {
   // private UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
    private UserDao userDao = null;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void login(String name, String password) {
        userDao.queryUserByNameAndPassword(name,password);
    }

    public void register(User user) {
        userDao.saveUser(user);
    }
}
