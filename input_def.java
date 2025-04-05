// Make calculator using function:

import java.util.Scanner;

public class input_def {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("\nChoose an operation:\n");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");
        System.out.print("\nEnter your choice (1-5):");
        int choice = input.nextInt();

        int  total_sum = 0;
        boolean isValid = true;
            
        switch (choice) {
            case 1 -> {
                total_sum = sum(num1, num2);
                System.out.println("The given number of Addition is: " + total_sum);
            }
            case 2 -> {
                total_sum = subtract(num1, num2);
                System.out.println("The given number of Subtraction is: " + total_sum);
            }
            case 3 -> {
                total_sum = multiply(num1, num2);
                System.out.println("The given number of Multiplication is: " + total_sum);
            }
            case 4 -> {
                if (num2 != 0) {
                    double divide = divide(num1, num2);
                    System.out.println("The given number of Division is: " + divide);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
            }
            case 5 -> {
                if (num2 != 0) {
                    total_sum = modulo(num1, num2);
                    System.out.println("The given number of Modulo is: " + total_sum);
                } else {
                    System.out.println("Error! Modulo by zero is not allowed.");
                }
            }
            default -> System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }
        

        input.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        return (double) a / b;
    }

    static int modulo(int a, int b) {
        return a % b;
    }
}
