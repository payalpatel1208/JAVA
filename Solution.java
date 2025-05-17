import java.util.Scanner;

public class Solution {

    public int[] running_sum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; 

        int runningSum = 0; 
        for (int i = 0; i < n; i++) {
            runningSum += nums[i]; 
            result[i] = runningSum; 
        }
        
        return result; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

       
        Solution solution = new Solution();
        int[] result = solution.running_sum(nums);

        
        System.out.println("Running Sum:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        input.close();
    }
}

