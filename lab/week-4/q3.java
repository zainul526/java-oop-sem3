import java.util.*;

public class q3 {
    // 3. Write a Java program that takes a number as input and prints its
    // multiplication table upto 10.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Your Magical Table is here.....");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + " = " + num * i);
        }
    }
}