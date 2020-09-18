package Employee;

import DatabaseConnector.DatabaseConnector;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseQuery {

    public static void execute(String sql) {
        try {
            Statement statement = DatabaseConnector.getConnection().createStatement();
            statement.execute(sql);
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();


        }
    }
}
