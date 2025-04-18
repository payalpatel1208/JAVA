import java.util.Arrays;

public class Swap_array {
    public static void main(String[] args) {
        int[] arr = {2,8,5,6,4};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1 , int index3){
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }
}
