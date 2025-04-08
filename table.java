// Take a number as input and print the multiplication table for it

import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        for(int i = 0;i<10;i++){
            System.out.println(num + "x" + (i+1) + "=" + (num*(i+1)));
        }
    }
}
