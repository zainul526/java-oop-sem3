// 4. Write a Java program that takes three numbers as input to calculate and print the average of the
// numbers.
import java.util.*;
public class q4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        double num1 = sc.nextDouble();
                System.out.print("Enter Number 1:");
        double num2 = sc.nextDouble();
        System.out.print("Enter Number 1:");
        double num3 = sc.nextDouble();
        double avg = (num1+num2+num3)/3.0;
        System.out.println("The Average of "+num1 +" , "+num2+" , " + num3+ " is:  "+ avg );
    }
}
