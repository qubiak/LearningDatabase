import employee.Employee;
import employee.EmployeeDAO;

public class Main {

    public static void main(String[] args) {

        EmployeeDAO rd = new EmployeeDAO();

        for (Employee r: rd.getAll()) {
            System.out.println(r.getID() + " " + r.getName() + " " + r.getSurname() + " " + r.getSalary());
        }



    }
}
