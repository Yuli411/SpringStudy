package org.exemple.pojo;

import java.io.Serializable;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/2 23:56
 * @Description:
 */
public class Customer implements Serializable {
    //重载特点 参数个数不同 类型不同 顺序不同 类型相同语法报错
    private String name;
    private int age;
    public Customer(String name,
                    int age) {
        this.name = name;
        this.age = age;
    }



    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
