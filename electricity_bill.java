// Calculate Electricity Bill:

import java.util.Scanner;
public class electricity_bill {
    public static void main(String[] args) { 

        // input the reading for calculating electricity bill:

        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter your Current reading : ");
        float Current_reading = Scanner.nextFloat();
        System.out.print("Enter your Privious reading : ");
        float Privious_reading = Scanner.nextFloat();

        // Calcualte the Electricity Bill:

        float total_reading = (Current_reading - Privious_reading );
        double Unit = total_reading * 8.5;
        System.out.println(" Your total unit is "+ Unit);
        Scanner.close();
    }
}
