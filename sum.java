import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your fisrt number ");
        int sum1 = input.nextInt();
        System.out.print("Enter your second number ");
        int sum2 = input.nextInt();

        int sum = sum1 + sum2 ;
        System.out.println("sum =  " + sum);
        input.close();
    }
}
