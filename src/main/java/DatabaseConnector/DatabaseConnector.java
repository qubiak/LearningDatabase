package DatabaseConnector;

import java.sql.Connection;

public class DatabaseConnector {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            connection = initConnection();
        }
        return connection;
    }

    private static Connection initConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String username = "root";
            String password = "mysql";
            String url = "jdbc:mysql://localhost:3306/lerningdatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return null;
    }
}

