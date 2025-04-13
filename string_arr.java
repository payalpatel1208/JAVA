import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class string_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enetr value: ");
        String[] arr = new String[5];
       
        for(int i=0;i<arr.length;i++){
            arr[i] = input.next();
        }
        arr[1] = "payal";
        System.out.println(Arrays.toString(arr));
    }
}
