package dhbw.tabelle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://sql11.freesqldatabase.com:3306/sql11495010", "sql11495010", "SRwSuf13UR");

        return connection;
    }

}
