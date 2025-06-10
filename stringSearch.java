import java.util.Scanner;

public class stringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String name = input.nextLine();

        System.out.print("Input the target character to find the index: ");
        char target = input.next().charAt(0);

        boolean found = search(name, target);
        System.out.println("Character found: " + found);
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}

