package org.exemple.factorybean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/6 22:05
 * @Description:
 */
public class ConnectionFactory {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/mybatis?useSSL=false&serverTimezone=GMT&characterEncoding=utf-8&allowPublicKeyRetrieval=true";
    private String username = "root";
    private String password = "Yhurri..0411";


    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
