//find simple interest
import java.util.Scanner;
public class simple_intrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle of P : ");
        int Principle = input.nextInt();
        System.out.print("Enter Rate of R : ");
        int Rate = input.nextInt();
        System.out.print("Enter Time of T : ");
        int Time = input.nextInt();

        float simple_intrest = Principle*Rate*Time/100;
        System.out.println("Your simple_intrest is " + simple_intrest);
        input.close();
    }
    
}
