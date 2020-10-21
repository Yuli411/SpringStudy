package org.exemple.proxy;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/7 23:05
 * @Description:
 */
public interface UserService {

    public void register(User user);
    public boolean login(String name,String password);
}
