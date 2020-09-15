package Menu;

import Employee.*;

import java.util.Scanner;

public class Menu {

    public static void DBMenu() {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("for read press 1");
            System.out.println("for save press 2");
            System.out.println("for delate pres 3");

            int x = in.nextInt();

            switch (x) {

                case 1: {
                    ReadEmployee.ReadData();
                    break;
                }

                case 2: {
                    NewEmployee.newEmployeeData();
                    NewEmployee.newEmployeeSql();
                }

                case 3: {
                    RemoveEmployee.removeEmployeeData();
                    RemoveEmployee.removeEmployeeSql();
                }
            }
        }
    }
}

