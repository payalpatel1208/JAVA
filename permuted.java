import java.util.Scanner;
class permuted {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0;i<n;i++){
            result[i] = nums[nums[i]];
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

       
        permuted solution = new permuted();
        int[] result = solution.buildArray(nums);

        
        System.out.println("Permuted Sum:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        input.close();
    }
}