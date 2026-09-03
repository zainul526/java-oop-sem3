import java.util.*;
public class q5 {
    //5. Write a Java program to take a number, divide it by 2 and print the result until the number becomes
// less than 10.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = sc.nextDouble();
        while(num>=10){
            double i = num/2;
            System.out.println( i );
            num=i;
        }
    }
}
