//To find Armstrong Number between two given number;
import java.util.Scanner;
public class assi_7 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int Armstrong = input.nextInt();
        int num = Armstrong, sum = 0, digits = String.valueOf(Armstrong).length();

        while ( Armstrong > 0) {
            int digit = Armstrong % 10;
            sum += Math.pow(digit, digits);
            Armstrong /= 10;
        }
        if (num == sum){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
        input.close();    

    }
}
 