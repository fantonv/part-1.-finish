import java.util.Objects;

public class Employee {

    public static int counter;
    public int id;
    int salary;
    String fullName;
    int department;
    public Employee (int salary, String fullName, int department) {
        this.salary = salary;
        this.fullName = fullName;
        this.department = department;
        id = counter;
        counter++;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Зарплата: " + this.salary + " ФИО: " + this.fullName +
                " отдел: " + this.department + " ID " + id;
    }
}
