package org.exemple.factorybean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/6 22:23
 * @Description:
 */
public class StaticConnectionFactory {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybatis?useSSL=false&serverTimezone=GMT&characterEncoding=utf-8", "root", "Yhurri..0411");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }
}
