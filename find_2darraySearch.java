import java.util.Arrays;
import java.util.Scanner;;
public class find_2darraySearch {
    public static void main(String[] args) {
        int[][] arr = {
            {3,4,2},
            {5,14,8},
            {7,6,9}
        };
        int target = 14;
        int[] result = search2Darray(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] search2Darray(int[][] arr ,int target){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int collums = 0; collums < arr[rows].length; collums++) {
                if(arr[rows][collums]==target){
                    return new int[]{rows, collums};
                }
            }
        }
        return new int[]{-1 ,-1};
    }
}
