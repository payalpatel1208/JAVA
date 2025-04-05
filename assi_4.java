// Convert Dollar to Rupees:
import java.util.Scanner;
public class assi_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your amount in rupees: ");
        float rupees = input.nextFloat();
        float currency = (float) (rupees/85.99);
        System.out.println("Your USD is " + currency);
        input.close();
    }
}
