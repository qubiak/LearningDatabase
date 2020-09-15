package Employee;

import java.util.Scanner;

public class RemoveEmployee {

    private static Integer numID;

    public static void removeEmployeeData() {
        Scanner in = new Scanner(System.in);
        ReadEmployee.ReadData();
        System.out.println("Enter the user ID to delete");
        numID = in.nextInt();
    }

    public static void removeEmployeeSql() {
        String sql = String.format("DELETE FROM `employee` WHERE ID = '%s'", numID);
        //System.out.println(sql);

        DatabaseQuery.saveChanges(sql);
    }
}
