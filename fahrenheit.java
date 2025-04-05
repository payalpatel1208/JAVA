//Convert celcius to fahrenheit
import java.util.Scanner;
public class fahrenheit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter celcius : ");
        float tempC = input.nextFloat();

        float fahren = (tempC * 9/5) + 32;
        System.out.println("Fehrenheit is "+ fahren);
        input.close();
    }
}