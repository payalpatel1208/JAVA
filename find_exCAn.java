import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class find_exCAn {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();
    int max = 0;
    for(int candy: candies){
        if (candy > max){
            max = candy;
        }
    }

    for(int candy : candies){
        if (candy + extraCandies >= max){
            result.add(true);
        }
        else{
            result.add(false);
        }
    }
    return result;
}
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of children (array size): ");
        int size = input.nextInt();

        int[] candies = new int[size];
        System.out.println("Enter " + size + " candy counts:");
        for (int i = 0; i < size; i++) {
            candies[i] = input.nextInt();
        }

        System.out.print("Enter extra candies: ");
        int extraCandies = input.nextInt();
        find_exCAn solution = new find_exCAn();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);

        System.out.println("Result:");
        for (Boolean val : result) {
            System.out.print(val + " ");
        }

        input.close();
    }
}