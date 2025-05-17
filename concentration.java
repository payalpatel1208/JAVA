import java.util.Scanner;

public class concentration {
    
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        
        int[] num = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }

        concentration solution = new concentration();
        int[] result = solution.getConcatenation(num);

        System.out.print("Concatenated array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }

        input.close();
    }
}
