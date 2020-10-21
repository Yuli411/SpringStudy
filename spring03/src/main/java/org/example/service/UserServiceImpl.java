package org.example.service;

import org.example.dao.UserMapper;
import org.example.pojo.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: Yhurri
 * @Date: 18/08/2020 12:49
 * @Description:只用于业务计算和调用dao层
 */

//@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,timeout = 2,rollbackFor = {Exception.class})
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Override
    public void register(User user) {
//        try {
//            Thread.currentThread().sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        userMapper.saveUser(user);
        throw new RuntimeException("test");
    }

    @Override
    public void login(String name, String password) {

    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

//    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
