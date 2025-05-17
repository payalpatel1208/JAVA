import java.util.Scanner;

public class sum_array{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to add? ");
        int n = input.nextInt();

        int[] numbers = new int[n];  
        int sum = 0;                 

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt(); 
            sum += numbers[i];           
        }

        System.out.println("The total sum is: " + sum);

        input.close();  
    }
}
