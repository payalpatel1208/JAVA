import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int x = input.nextInt();
        System.out.println(isprime(x));
    }
    static boolean isprime(int x){
        if (x <= 1){
            return false;
        }
        int y = 2;
        while (y * y <= x) {
            if (x % y == 0){
                return false;
            }
            y++;
        }
        // return c * c > x;/
        return true;
    }
}