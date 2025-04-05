//Fibonacci series:

import java.util.Scanner;
public class ass_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value : ");

        int n = input.nextInt();
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        input.close();
    }
}
