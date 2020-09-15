package Employee;

import Employee.Model.Employee;

public class ReadEmployee {

    public static void ReadData() {

        ReadEmployeeDAO rd = new ReadEmployeeDAO();

        for (Employee r : rd.getAll()) {
            System.out.println(String.format("ID: %s %s %s %s", r.getID(), r.getName(), r.getSurname(), r.getSalary()));
        }
    }
}
