import java.util.*;

// Employee Management System
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

class EmployeeManagement {
    private ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(int id, String name, double salary) {
        employees.add(new Employee(id, name, salary));
    }

    void updateEmployee(int id, String name, double salary) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                emp.name = name;
                emp.salary = salary;
                return;
            }
        }
    }

    void removeEmployee(int id) {
        employees.removeIf(emp -> emp.id == id);
    }

    Employee searchEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.id == id) return emp;
        }
        return null;
    }
    public class Main {
    public static void main(String[] args) {
        EmployeeManagement ems = new EmployeeManagement();
        ems.addEmployee(1, "Alice", 50000);
        ems.addEmployee(2, "Bob", 60000);
        System.out.println("Employee Search: " + ems.searchEmployee(1));
    }
}