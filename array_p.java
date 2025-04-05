import java.util.Arrays;

public class array_p {
    public static void main(String[] args) {
        int[] arr = {1,3,32,5,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change (int[] nums){
        nums[0] = 99;
    }
}
