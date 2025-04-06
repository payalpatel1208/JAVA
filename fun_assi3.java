// A person is eligible to vote if his/her age is greater than or equal to 18 so find out if he/she is eligible to vote.

import java.util.Scanner;
public class fun_assi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        eligible_vote(age);

        input.close();
    }

    public static void eligible_vote(int age){
        if (age >= 18){
            System.out.println("congratulation! you are eligible to vote ");
        }
        else{
            System.out.println("You are not eligible to vote ");
        }
        
    }
}
