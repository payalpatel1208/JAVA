// To Find Largest number
import java.util.Scanner;
public class assi_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = input.nextInt();
        System.out.print("Enter b ");
        int b = input.nextInt();
        if (a>b){
            System.out.println("Largest number is A");
        }
        else{
            System.out.println("Largest number is B");
        }
        input.close();
    }
}
