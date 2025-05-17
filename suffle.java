import java.util.Scanner;

public class suffle {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements (even number): ");
        int a = input.nextInt(); 

        if (a % 2 != 0) {
            System.out.println("Number of elements must be even.");
            input.close();
            return;
        }

        int[] nums = new int[a];

        System.out.println("Enter elements for nums array:");
        for (int i = 0; i < a; i++) {
            nums[i] = input.nextInt();
        }

        int n = a / 2; 
        suffle solution = new suffle();
        int[] result = solution.shuffle(nums, n);

        System.out.print("Shuffled Array: ");
        for (int value : result) {
            System.out.print(value + " ");
        }

        input.close();
    }
}
