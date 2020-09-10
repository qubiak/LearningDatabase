package employee;

import java.util.Scanner;

public class RemoveEmployee {

    public static void RemoveData() {
        Scanner in = new Scanner(System.in);

        ReadEmployee.ReadData();


        System.out.println("Enter the user ID to delete");
        int x = in.nextInt();

        String sql = String.format("DELETE FROM `employee` WHERE ID = '%s'", x);
        //System.out.println(sql);

        ActionsOnData.saveChanges(sql);
    }
}
