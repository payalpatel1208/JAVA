import java.util.Scanner;

public class SearchRange {

    public static void main(String[] args) {
         Scanner input =  new Scanner(System.in);
        System.out.print("Input the number of array: ");
        int size = input.nextInt();
        int[] nums = new int[size];

        System.out.println("Input the number of array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        System.out.print("input the target to find to index: ");
        int target = input.nextInt();

        System.out.print("input the target to find to starting index: ");
        int start = input.nextInt();

        System.out.print("input the target to find to ending index: ");
        int end = input.nextInt();
        // int[] nums = {2,3,4,5,6,9};
        // int target =  6;
        int ans = linearSearch(nums, target, start,end);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr , int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

    return -1;
    }
}