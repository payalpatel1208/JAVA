import java.util.Arrays;
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // Using toString:
        // for(int i=0;  i < arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }    
    }
}
