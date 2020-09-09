import employee.Employee;
import employee.NewEmployeeData;
import employee.ReadEmployeeDAO;

import java.util.Scanner;

public class DBReadOrSave {

    public static void chooser() {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("for read press 1");
            System.out.println("for save press 2");

            int x = in.nextInt();

            switch (x) {

                case 1: {

                    ReadEmployeeDAO rd = new ReadEmployeeDAO();

                    for (Employee r : rd.getAll()) {
                        System.out.println("ID: " + r.getID() + " " + r.getName() + " " + r.getSurname() + " " + r.getSalary());
                    }
                    break;
                }

                case 2: {

                    NewEmployeeData.chooser();
                }


            }

        }
    }
}

