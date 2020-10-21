package org.exemple.test1;

import org.exemple.beanpost.Category;
import org.exemple.converter.Person;
import org.exemple.factorybean.ConnectionFactory;
import org.exemple.factorybean.ConnectionFactoryBean;
import org.exemple.life.Product;
import org.exemple.pojo.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ConversionServiceFactoryBean;

import java.sql.Connection;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/6 15:47
 * @Description:
 */
public class Test2 {
    //测试connectionfactorybean
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connection = ac.getBean("connection", Connection.class);
        System.out.println(connection);
        Connection connection2 = ac.getBean("connection", Connection.class);
        System.out.println(connection2);
    }

    @Test
    public void test2() {
        //获得factorybean对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConnectionFactoryBean connection = ac.getBean("&connection", ConnectionFactoryBean.class);
        System.out.println(connection);
    }

    //测试实例工厂
    @Test
    public void test3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connection = (Connection) ac.getBean("connection");
        System.out.println(connection);
    }

    @Test
    public void test4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account = ac.getBean("account", Account.class);
        Account account2 = ac.getBean("account", Account.class);
        System.out.println(account);
        System.out.println(account2);
    }

    @Test
    public void test5() {
        //create spring factory
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) ac.getBean("product");
        //关闭容器时会调用销毁的方法 只适用于单例模式 非单例不调用
        ac.close();


    }

    @Test
    public void test6() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connection = ac.getBean("connection", Connection.class);
        System.out.println(connection);
    }

    @Test
    public void test7() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.getConnection();
        System.out.println(connection);

    }

    //test converter

    @Test
    public void test8(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void test9(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Category category = (Category) ac.getBean("category");
        System.out.println(category);
    }



}
