import java.util.Scanner;

public class wealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int people = input.nextInt();

        System.out.print("Enter the number of banks/accounts per person: ");
        int banks = input.nextInt();

        int[][] accounts = new int[people][banks];

        for (int i = 0; i < people; i++) {
            System.out.println("Enter wealth for person " + (i + 1) + ":");
            for (int j = 0; j < banks; j++) {
                accounts[i][j] = input.nextInt();
            }
        }

        wealth solution = new wealth();
        int maxWealth = solution.maximumWealth(accounts);

        System.out.println("The maximum wealth is: " + maxWealth);

        input.close();
    }
}
