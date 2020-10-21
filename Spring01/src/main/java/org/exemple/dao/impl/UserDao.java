package org.exemple.dao.impl;

import org.exemple.pojo.User;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/2 15:21
 * @Description:
 */
public interface UserDao {

    public void queryUserByNameAndPassword(String name,String password);

    public void saveUser(User user);


}
