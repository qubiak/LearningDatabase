package employee;

import DatabaseConnector.DatabaseConnector;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NewEmployee {

    public static void chooser()    {

        Scanner input = new Scanner(System.in);


        System.out.println("Podaj imię pracownika");
        String name = input.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        String surname = input.nextLine();
        System.out.println("Podaj wynagrodzenie pracownika");
        int salary = input.nextInt();

        System.out.println("imię: " + name + ", nazwisko: " + surname + ", wynagrodzenie: " + salary);


        String sql = String.format("INSERT INTO employee(name, surname, salary) VALUES ( '%s', '%s' , '%s')", name, surname, salary);
        //System.out.println(sql);

        try {
            Statement statement = DatabaseConnector.getConnection().createStatement();
            statement.execute(sql);
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
