// give grade according to the marks: 

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get total subjects and marks from user
        System.out.print("Enter your total_subject: ");
        float subject = input.nextFloat();
        System.out.print("Enter your total marks: ");
        float marks = input.nextFloat();

        grade(subject, marks);
    }

    public static void grade(float subject, float marks) {
 
        float percentage = (marks * 100) / (subject * 100); 

        if (marks > 90) {
            System.out.println("Your grade is A");
        } else if (marks >= 80) {
            System.out.println("Your grade is B");
        } else if (marks >= 70) {
            System.out.println("Your grade is C");
        } else if (marks >= 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
        System.out.println("Your percentage is: " + percentage + "%");
    }
}
