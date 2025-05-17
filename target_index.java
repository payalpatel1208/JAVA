import java.util.ArrayList;
import java.util.Scanner;

public class target_index {
    public int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        System.out.println("Enter elements for nums array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Enter elements for index array:");
        for (int i = 0; i < n; i++) {
            index[i] = input.nextInt();
        }

        target_index solution = new target_index();
        int[] result = solution.createTargetArray(nums, index);

        System.out.print("Target Array: ");
        for (int value : result) {
            System.out.print(value + " ");
        }

        input.close();
    }
}
