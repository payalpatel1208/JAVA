import java.util.Scanner;
public class max_array {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int[] arr = {3,44,1,3,4,5,99};
        System.out.println("Maximum value is");
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max_value = arr[0];
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    }
}
