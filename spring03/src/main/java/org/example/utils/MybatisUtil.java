package org.example.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: Yhurri
 * @Date: 26/07/2020 23:54
 * @Description:
 */
public class MybatisUtil {
    private static SqlSessionFactory factory = null;

    static{
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(is);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession getSqlSession(){
        if (factory != null){
            return factory.openSession(true);
        }
        return null;
    }
}
