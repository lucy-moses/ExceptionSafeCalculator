import operations.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to Java Calculator");
        System.out.println("--------------------------");

        while (true) {
            displayMenu();
            int choice = getMenuChoice();

            if (choice == 8) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }

            processOperation(choice);
        }

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\nPlease select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.println("7. Square Root");
        System.out.println("8. Exit");
    }

    private int getMenuChoice() {
        while (true) {
            try {
                System.out.print("Enter your choice (1-8): ");
                int choice = scanner.nextInt();
                if (choice < 1 || choice > 8) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                    continue;
                }
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    private void processOperation(int choice) {
        try {
            double result;

            switch (choice) {
                case 1: // Addition
                    double add1 = getNumber("Enter first number: ");
                    double add2 = getNumber("Enter second number: ");
                    result = new AddOperation().calculate(add1, add2);
                    System.out.printf("Result: %.2f + %.2f = %.2f\n", add1, add2, result);
                    break;

                case 2: // Subtraction
                    double sub1 = getNumber("Enter first number: ");
                    double sub2 = getNumber("Enter second number: ");
                    result = new SubtractOperation().calculate(sub1, sub2);
                    System.out.printf("Result: %.2f - %.2f = %.2f\n", sub1, sub2, result);
                    break;

                case 3: // Multiplication
                    double mul1 = getNumber("Enter first number: ");
                    double mul2 = getNumber("Enter second number: ");
                    result = new MultiplyOperation().calculate(mul1, mul2);
                    System.out.printf("Result: %.2f * %.2f = %.2f\n", mul1, mul2, result);
                    break;

                case 4: // Division
                    double div1 = getNumber("Enter dividend: ");
                    double div2 = getNumber("Enter divisor: ");
                    result = new DivideOperation().calculate(div1, div2);
                    System.out.printf("Result: %.2f / %.2f = %.2f\n", div1, div2, result);
                    break;

                case 5: // Square
                    double squareInput = getNumber("Enter a number: ");
                    result = new SquareOperation().calculate(squareInput);
                    System.out.printf("Result: %.2f² = %.2f\n", squareInput, result);
                    break;

                case 6: // Cube
                    double cubeInput = getNumber("Enter a number: ");
                    result = new CubeOperation().calculate(cubeInput);
                    System.out.printf("Result: %.2f³ = %.2f\n", cubeInput, result);
                    break;

                case 7: // Square Root
                    double sqrtInput = getNumber("Enter a number: ");
                    result = new SquareRootOperation().calculate(sqrtInput);
                    System.out.printf("Result: √%.2f = %.2f\n", sqrtInput, result);
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private double getNumber(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }
}