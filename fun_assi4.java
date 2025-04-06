// Write a program to print the circumference and area of a circle of radius.

import java.util.Scanner;
public class fun_assi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double radius = input.nextDouble();
        circumference(radius);
        input.close();
    }
    public static double circumference(double radius){
        double area = Math.PI *(radius*radius);
        System.out.println("The area of circle is: " + area);
        double circumference_circle = Math.PI * 2*radius;
        System.out.println("The circumference of the circle is:"+circumference_circle);
               return circumference_circle;
    }
}
    
