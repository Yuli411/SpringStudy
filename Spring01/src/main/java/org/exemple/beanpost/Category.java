package org.exemple.beanpost;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/7 21:46
 * @Description:
 */
public class Category  {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
