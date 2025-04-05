// using swich statement:
import java.util.Scanner;
public class swich_stete {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of fruit: ");
        String fruit = input.nextLine();

        switch  (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("A red fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Grapes" -> System.out.println("A smaller fruit fruit");
            default -> System.out.println("Enter valid fruit name");

        }

    }

    
}
