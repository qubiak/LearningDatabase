package employee;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployeeDAO {

    public List<Employee> getAll() {
        List<Employee> result = new ArrayList<>();

        try {
            Statement statement = DatabaseConnector.DatabaseConnector.getConnection().createStatement();
            String sql = "select * from employee";
            ResultSet rows = statement.executeQuery(sql);
            while (rows.next()) {
                Employee e = new Employee();
                e.setID(rows.getLong("ID"));
                e.setName(rows.getString("name"));
                e.setSurname(rows.getString("surname"));
                e.setSalary(rows.getLong("salary"));
                result.add(e);

            }
            rows.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
