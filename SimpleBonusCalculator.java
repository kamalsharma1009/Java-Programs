import java.util.Scanner;

// Base class Employee
class Employee {
    String name;
    double salary;

    // Constructor for Employee
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate bonus for an employee (10%)
    double calculateBonus() {
        return salary * 0.10;
    }
}

// Subclass Manager that inherits from Employee
class Manager extends Employee {

    // Constructor for Manager
    Manager(String name, double salary) {
        super(name, salary);  // Call the constructor of Employee
    }

    // Overriding the calculateBonus method to give Manager a higher bonus (20%)
    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

public class SimpleBonusCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for name and salary
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        scanner.nextLine(); // consume newline character
        System.out.print("Enter role (employee/manager): ");
        String role = scanner.nextLine();

        // Create an object based on role
        Employee emp;

        if (role.equals("manager")) {
            emp = new Manager(name, salary);  // Creating a Manager object
        } else {
            emp = new Employee(name, salary);  // Creating an Employee object
        }

        // Calculate and display the bonus
        double bonus = emp.calculateBonus();
        System.out.println("Bonus for " + emp.name + ": $" + bonus);

        scanner.close();
    }
}
