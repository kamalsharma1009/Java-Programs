import java.util.Scanner;

public class ArithmeticOperations {

    // Method to read a number from user
    public static double readNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Method to perform arithmetic operations
    public static void performOperations(double num1, double num2) {
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    // Main method
    public static void main(String[] args) {
        double number1 = readNumber("Enter first number: ");
        double number2 = readNumber("Enter second number: ");
        performOperations(number1, number2);
    }
}
