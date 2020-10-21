package org.exemple.proxy;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/7 23:06
 * @Description:
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService = new UserServiceImpl();



    public void register(User user) {
        System.out.println("register proxy");
        userService.register(user);
    }

    public boolean login(String name, String password) {
        System.out.println("login proxy");

        return userService.login(name,password);
    }
}
