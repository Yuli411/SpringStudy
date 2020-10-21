import org.exemple.proxy.OrderService;
import org.exemple.proxy.User;
import org.exemple.proxy.UserService;
import org.exemple.proxy.UserServiceProxy;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/7 23:16
 * @Description:
 */
public class Test1 {
    @Test
    public void test1(){
        UserService userServiceProxy = new UserServiceProxy();
        userServiceProxy.register(new User());

    }
    //test spring dynamic proxy

    @Test
    public void test2(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.register(new User());
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService orderServicez = (OrderService) ca.getBean("orderService");
        System.out.println(orderServicez.expedition());
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ca.getBean("userService");
        boolean yyl = userService.login("yyl", "123456");
        userService.register(new User());
    }

    //test beanpostprocessor

    @Test
    public void test5(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext2.xml");
        org.exemple.factory.UserService userService = (org.exemple.factory.UserService) ca.getBean("userService");
        userService.register(new User());
    }

    //test aop with annotation
    @Test
    public void test6(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext3.xml");
        org.exemple.aspect.UserService userService = (org.exemple.aspect.UserService) ca.getBean("userService");
        userService.register(new User());


    }




}
