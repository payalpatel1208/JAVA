// find num is minimum or maximum number among three numbers: 

import java.util.Scanner;
public class fun_assi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int num_1 = input.nextInt();

        System.out.print("Enter num 2: ");
        int num_2 = input.nextInt();

        System.out.print("Enter num 3: ");
        int num_3 = input.nextInt();

        int largest_num = largest_num(num_1,num_2,num_3);
        int minimum_num = minimum_num(num_1,num_2,num_3);

        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", num_1,num_2,num_3,largest_num);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", num_1,num_2, num_3,minimum_num);
        input.close();
    }

    public static int largest_num(int num_1 , int num_2 , int num_3){
        int max = num_1;
        if (num_2 > max){
            max = num_2;
        }

        if (num_3 > max){
            max = num_3;
        }

        return max;
    }
    public static int minimum_num(int num_1 , int num_2 , int num_3){
        int min = num_1;
        if (num_2 < min){
            min = num_2;
        }

        if (min > num_3 ){
            min = num_3;
        }

        return min;
    }
}
    
