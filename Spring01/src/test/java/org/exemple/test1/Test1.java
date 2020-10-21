package org.exemple.test1;

import org.exemple.pojo.BeanFactory;
import org.exemple.pojo.Customer;
import org.exemple.pojo.Person;
import org.exemple.pojo.User;
import org.exemple.service.impl.UserService;
import org.exemple.service.impl.UserServiceimpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/2 15:52
 * @Description:
 */
public class Test1 {
    @Test
    public void controllerTest(){
        UserService userService = (UserService) BeanFactory.getBean("userService");
        userService.login("lyl","yhurri0411");
        User user = new User("lyl","123456");
        userService.register(user);
    }

    @Test
    public void getNewInstance(){
        Person person = (Person) BeanFactory.getBean("person");
    }

    @Test
    public void firstSpring(){
        //not web env
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //put value of id
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = applicationContext.getBean("person", Person.class);
        //要求配置文件中只能有一个bean class是person类型
        Person bean = applicationContext.getBean(Person.class);
        //获取所有bean标签的id值
    //    String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }

//        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
//        for (String s : beanNamesForType) {
//
//            System.out.println(s);
//        }
        //if a certain id exists in the xml
        boolean ifExist = applicationContext.containsBeanDefinition("person5");
        System.out.println(ifExist);

        boolean b = applicationContext.containsBean("person");
        System.out.println(b);


    }

    @Test
    public void detailOfBean(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = (Person) cpx.getBean("p");
        System.out.println(p);
        //can only juge id
        cpx.containsBeanDefinition("person");
        //can juge id and name
        cpx.containsBean("p");

    }

    // test of injection

    @Test
    public void test7(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = cpx.getBean("person", Person.class);
        person.setId(1);
        person.setName("tom");
        System.out.println(person);
    }
    //injection with xml
    @Test
    public void test8(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = cpx.getBean("person", Person.class);

        System.out.println(person);
    }

    @Test
    public void injection2(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = cpx.getBean("person", Person.class);
        String[] emails = person.getEmails();
        for (String email:emails){
            System.out.println(email);
        }
    }

    @Test
    public void injection3(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = cpx.getBean("person", Person.class);
        Set<String> tels = person.getTels();
        for (String tel: tels){
            System.out.println(tel);
        }
    }

    @Test
    public void injection4(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = cpx.getBean("person", Person.class);
        List<String> adresses = person.getAdresses();
        for (String adresse: adresses){
            System.out.println(adresse);
        }
    }

    @Test
    public void injection5(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = cpx.getBean("person", Person.class);
        Map<String, String> qqs = person.getQqs();
        for(Map.Entry entry:qqs.entrySet()){
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);

        }
    }

    @Test
    public void injection6(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = cpx.getBean("person", Person.class);
        Properties properties = person.getProperties();
        String key1 = properties.getProperty("key1");

    }

    //test customer-defined variable

    @Test
    public void injection7(){
        ApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = cpx.getBean("userService", UserService.class);
        userService.login("tom","123456");

    }

    //test injection with constructor
    @Test
    public void injection8(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer = cpx.getBean("customer", Customer.class);
        System.out.println(customer);
    }
}
