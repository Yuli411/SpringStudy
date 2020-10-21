package org.exemple.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/6 22:42
 * @Description:
 */
public class Product implements InitializingBean, DisposableBean {

    public Product() {
        System.out.println("product is created");
    }

    //初始化操作 spring调用
    public void afterPropertiesSet() throws Exception {
        System.out.println("accomplishment of initialization");
    }

    public void myInit() {
        System.out.println("product.init");
    }

    public void destroy() throws Exception {
        System.out.println("destory============================");
    }

    public void myDestroy() throws Exception{
        System.out.println("myDestory");
    }
}
