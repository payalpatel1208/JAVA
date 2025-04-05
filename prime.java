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
        int c = 2;
        while (c * c <= x) {
            if (x % c == 0){
                return false;
            }
            c++;
        }
        // return c * c > x;/
        return true;
    }
}