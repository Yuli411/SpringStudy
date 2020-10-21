package org.exemple.test1;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.UserMapper;
import org.example.pojo.User;
import org.example.service.UserService;
import org.example.utils.MybatisUtil;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: Yhurri
 * @Date: 27/07/2020 00:00
 * @Description:
 */
public class MybatisTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(1,"tom","1234546");
        System.out.println(user);
        mapper.saveUser(user);
        sqlSession.commit();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) cpx.getBean("userMapper");
        User user = new User();
        user.setName("xjr");
        user.setPassword("123456000");
        userMapper.saveUser(user);

    }

    @Test
    public void test3(){
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();

    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        User user = new User();
        user.setName("xbb");
        user.setPassword("123789456");
        userService.register(user);
    }

    @Test
    public void test5(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        User user = new User();
        user.setName("xbb");
        user.setPassword("123789456");
        userService.register(user);
    }
}
