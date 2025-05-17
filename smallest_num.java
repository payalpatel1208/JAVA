import java.util.Scanner;
public class smallest_num {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int [] result = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
           int count = 0;

           for(int j = 0; j<nums.length;j++){
                if(nums[j] < nums[i])
                count++;
           }
           result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        
        int[] nums = new int[n];

        System.out.println("Enter the elements: ");
       
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        smallest_num  obj = new smallest_num ();
        int[] result = obj.smallerNumbersThanCurrent(nums);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        input.close();
}
}

