import java.util.Scanner;

class SpecialCalculator {
    static double addition(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpecialCalculator calculator = new SpecialCalculator();

        while (true) {
            System.out.println("Calculator Roles:");
            System.out.println("1. Normal");
            System.out.println("2. Opposite");
            System.out.println("3. Quit");

            System.out.print("Select a calculator role (1/2/3): ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Select operation (+/-): ");
                char operation = scanner.nextLine().charAt(0);
                System.out.print("Enter the first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                if (operation == '+') {
                    double result = calculator.addition(num1, num2);
                    System.out.println("Result: " + result);
                } else if (operation == '-') {
                    double result = calculator.subtraction(num1, num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Invalid operation.");
                }

            } else if (choice.equals("2")) {
                System.out.print("Select operation (+/-): ");
                char operation = scanner.nextLine().charAt(0);
                System.out.print("Enter the first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                if (operation == '+') {
                    double result = calculator.subtraction(num1, num2);
                    System.out.println("Result: " + result);
                } else if (operation == '-') {
                    double result = calculator.addition(num1, num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Invalid operation.");
                }

            } else if (choice.equals("3")) {
                System.out.println("Exiting the calculator.");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}