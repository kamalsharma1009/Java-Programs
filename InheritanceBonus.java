import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        return 0;
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

public class InheritanceBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Manager
        System.out.print("Enter Manager's name: ");
        String managerName = scanner.nextLine();
        System.out.print("Enter Manager's salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        // Input for Developer
        System.out.print("Enter Developer's name: ");
        String developerName = scanner.nextLine();
        System.out.print("Enter Developer's salary: ");
        double developerSalary = scanner.nextDouble();

        // Create objects
        Manager m = new Manager(managerName, managerSalary);
        Developer d = new Developer(developerName, developerSalary);

        // Output
        System.out.println("Manager Bonus: " + m.calculateBonus());
        System.out.println("Developer Bonus: " + d.calculateBonus());

        scanner.close();
    }
}
