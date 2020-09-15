package Employee;

import java.util.Scanner;

public class NewEmployee {

    public static String name;
    public static String surname;
    public static Integer salary;

    public static void newEmployeeData() {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj imię pracownika");
        name = input.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        surname = input.nextLine();
        System.out.println("Podaj wynagrodzenie pracownika");
        salary = input.nextInt();

        System.out.println("imię: " + name + ", nazwisko: " + surname + ", wynagrodzenie: " + salary);
    }

    public static void newEmployeeSql() {

        String sql = String.format("INSERT INTO employee(name, surname, salary) VALUES ( '%s', '%s' , '%s')", name, surname, salary);
        //System.out.println(sql);

        DatabaseQuery.saveChanges(sql);

    }
}
