import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        int p,q,r,s;
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter the number of rows of first metrix: ");
        p = input.nextInt();
        System.out.print("Enter the number of colums of first metrix: ");
        q = input.nextInt();
        System.out.print("Enter the number of rows of second metrix: ");
        r = input.nextInt();
        System.out.print("Enter the number of colums of second metrix: ");
        s = input.nextInt();
        if(p == r && q == s){
            int a[][] = new int[p][q];
            int b[][] = new int[r][s];
            int c[][] = new int[r][s];
           
            System.out.print("Enter all the elements of first matrix:");
            for(int i = 0; i < p; i++){
                for(int j = 0; j < q; j++){
                    a[i][j] = input.nextInt();
                }
            }
            //System.out.println(end = "");
            System.out.print("Enter all the elements of second matrix:");
            for(int i = 0; i < r; i++){
                for(int j = 0; j < s; j++){
                    b[i][j] = input.nextInt();
                }
            }
            // System.out.println("");
            System.out.println("\nFirst Matrix");
            for(int i = 0; i < p; i++){
                for (int j= 0; j < q;j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nsecond Matrix");
            for(int i = 0; i < r; i++){
                for (int j= 0; j < s; j++){
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The sum of total number of matrix");
            for(int i = 0; i < p; i++){
                for(int j = 0; j < q; j++){
                    // for(int k = 0; k < q; k++)
                    // {
                        c[i][j] = a[i][j]+b[i][j];
                    // }
                }
            }
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Addition not possible");
            System.out.println("Try Again");
        }
    }
}
