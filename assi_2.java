//calculate number
import java.util.Scanner;
public class assi_2 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a: ");
    int first_num = input.nextInt();
    System.out.print("Enter b: ");
    int second_num = input.nextInt();
    System.out.println("Choose an operation: ");
        System.out.println("1. +  2. -  3. *  4. /");
        String operator = input.next();

    if (operator.equals("+")){
        System.out.print(first_num + second_num);
    }
    else if (operator.equals("-")){
        System.out.print(first_num - second_num);
    }
    else if (operator.equals("*")){
        System.out.print(first_num * second_num);

    }
    else if (operator.equals("/")){
        System.out.print(first_num / second_num);
    }
    else{
        if (second_num == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + ((double) first_num / second_num));
        }
    }
    input.close();
    }
}

