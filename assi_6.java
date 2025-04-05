// To find out whether the given String is Palindrome or not:
import java.util.Scanner;
public class assi_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string :");
        String Palindrome = input.nextLine();
        String reversed  = new StringBuilder(Palindrome).reverse().toString();
        
        if (Palindrome .equals(reversed)){
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Given string is not Palindrome");
        }
        input.close();
    }
}

