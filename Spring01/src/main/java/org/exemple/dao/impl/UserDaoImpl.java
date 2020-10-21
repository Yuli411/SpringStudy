package org.exemple.dao.impl;

import org.exemple.pojo.User;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/2 15:45
 * @Description:
 */
public class UserDaoImpl implements UserDao {
    public void queryUserByNameAndPassword(String name, String password) {
        System.out.println("select * from t_user where name = name, password = password");
    }

    public void saveUser(User user) {
        System.out.println("insert into t_user values(" + user.getName() +"," + user.getPassword()+")");
    }
}
