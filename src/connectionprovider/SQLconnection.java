package connectionprovider;

import java.sql.*;

/**
 *
 * @author zed
 */
public class SQLconnection {

    public static Connection connect() {

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=EnigmaMachine;user=zed;password=password;";

            Connection con = DriverManager.getConnection(connectionURL);

            return con;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return null;
    }

}
