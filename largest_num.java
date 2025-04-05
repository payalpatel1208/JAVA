// find the largest number:

import java.util.Scanner;
public class largest_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();
        System.out.print("Enter C: ");
        int c = input.nextInt();

        // Using condition to find the largest number:

        if (a > c){
            System.out.println("The largest number is A");
        }
        else if (b > c){
            System.out.println("The largest number is B");
        }
        else{
            System.out.println("The largest number is C");
        }
        input.close();
    }
}
