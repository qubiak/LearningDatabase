import employee.*;

import java.util.Scanner;

public class DBchooser {

    public static void chooser() {

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

                    NewEmployee.chooser();
                }

                case 3: {

                    RemoveEmployee.RemoveData();

                }


            }

        }
    }
}

