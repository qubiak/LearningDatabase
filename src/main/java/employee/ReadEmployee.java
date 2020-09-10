package employee;

public class ReadEmployee {

    public static void ReadData() {

        ReadEmployeeDAO rd = new ReadEmployeeDAO();

        for (Employee r : rd.getAll()) {
            System.out.println("ID: " + r.getID() + " " + r.getName() + " " + r.getSurname() + " " + r.getSalary());
        }
    }
}
