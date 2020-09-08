import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

    public static void DBConection() {


        Connection connection = null;

        try {
            String userName = "root";
            String password = "mysql";
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/lerningdatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            System.err.println("Database connection established");
        } catch (Exception e) {
            System.out.println("Cannot connect to database server " + e);


        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database connection terminated");
                } catch (Exception ignored) {
                }
            }
        }

    }

}
