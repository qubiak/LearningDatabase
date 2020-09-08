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
                    DBRead.readFramDatabase();
                }

                case 2: {
                    employee.employeeData();
                    DBSave.saveToDatabase();

                }

            }
        }
    }
}
