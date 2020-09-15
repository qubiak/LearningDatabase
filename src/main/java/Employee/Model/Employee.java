package Employee.Model;

public class Employee {

    private Long ID;
    private String name;
    private String surname;
    private Long salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getSalary() {
        return salary;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
