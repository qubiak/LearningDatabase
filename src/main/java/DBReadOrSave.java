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
                    Scanner input = new Scanner(System.in);

                    System.out.println("Podaj imię pracownika");
                    String name = input.nextLine();
                    System.out.println("Podaj imięnazwisko pracownika");
                    String surname = input.nextLine();
                    System.out.println("Podaj wynagrodzenie pracownika");
                    int salary = input.nextInt();

                    System.out.println("imię: " + name + ", nazwisko: " + surname + ", wynagrodzenie: " + salary);
                }
                DBSave.saveToDatabase();

            }

        }
    }
}

