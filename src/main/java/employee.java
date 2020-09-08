import java.util.Scanner;

public class employee {

    public static void employeeData() {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj imię pracownika");
        String name = input.nextLine();
        System.out.println("Podaj imięnazwisko pracownika");
        String surname = input.nextLine();
        System.out.println("Podaj wynagrodzenie pracownika");
        int salary = input.nextInt();

        System.out.println("imię: " + name + ", nazwisko: " + surname + ", wynagrodzenie: " + salary);
    }
}
