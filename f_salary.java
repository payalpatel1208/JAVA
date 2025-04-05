import java.util.Scanner;
class f_salary {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter salary: ");
    int salary = input.nextInt();
    if (salary > 25000){
        salary += 2000;
        System.out.println("You will give 2000 rupees in bouns " + salary );
    }
    else {
        salary += 1000;
        System.out.println("You will give 1000 rupees in bouns " + salary);
    }
    input.close();
    }
}

