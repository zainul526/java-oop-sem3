import java.util.*;

public class q6 {

    // 6. Write a Java program to calculate the factorial of a number.
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial of Negative Number is Undefined . ");
        } else {

            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }

    }
}