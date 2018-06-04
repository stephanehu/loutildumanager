/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprisebusinessintelligence.controllerdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nanan Tanoh
 */
public class ConnectionPool {

    protected static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;

    public static Connection getConnection() {

        if (connection == null) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Config.connection_url, Config.DATABASE_USER_ID, Config.DATABASE_PASSWORD);

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return connection;
    }

    public static void ExecuteSQLStatement(String sql_stmt) {
        try {
            if (connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Config.connection_url, Config.DATABASE_USER_ID, Config.DATABASE_PASSWORD);
            }
            statement = connection.createStatement();

            statement.executeUpdate(sql_stmt);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }

}
