// using function method find number is odd or even:

import java.util.Scanner;
public class fun_assi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();
        odd_even(num);

        input.close();

    }
    public static int odd_even(int num) {
        if (num % 2 == 0){
            System.out.println("The number is even");
        }

        else{
            System.out.println("number is odd");
        }

        return num;
    }
}
