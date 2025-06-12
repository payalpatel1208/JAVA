import java.util.Scanner;
public class searchingMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of string: ");
        int size = input.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the integer value: ");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }    
        // int[] arr = {3,2,7,4,5,6,8,2};
        int ans = minimumValue(nums);
        System.out.println("Your minimum value is: " + ans);
    }
    static int minimumValue(int[] arr){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < result){
                result = arr[i];
            }
        }
        return result;

    }
}
