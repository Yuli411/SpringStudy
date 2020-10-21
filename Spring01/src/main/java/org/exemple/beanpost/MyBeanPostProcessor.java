package org.exemple.beanpost;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/7 21:49
 * @Description:
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            if (bean instanceof Category) {
                Category category = (Category) bean;
                category.setName("yyl");
                return category;
            }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
