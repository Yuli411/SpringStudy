package org.exemple.pojo;

import org.exemple.dao.impl.UserDao;
import org.exemple.service.impl.UserService;
import org.exemple.service.impl.UserServiceimpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/2 16:10
 * @Description:
 */
public class BeanFactory {
    private static Properties env = new Properties();

    static{
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("applicarioncontext.properties");
        try {
            env.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    对象的构造方式
    1. 直接new 耦合
    2. 通过反射
    Class<forName
     */
//    public static UserService getUserService(){
//        UserService userService = null;
//        try {
//
//            String service = env.getProperty("userService");
//            userService = (UserService) Class.forName(service).newInstance();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return userService;
//    }
//
//    public static UserDao getUserDao(){
//        UserDao userDao = null;
//        try {
//            userDao = (UserDao) Class.forName(env.getProperty("userDao")).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return userDao;
//    }

    public static Object getBean(String beanName){
        Object ret = null;
        try {
            ret = Class.forName(env.getProperty(beanName)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ret;
    }

}
