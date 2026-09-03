import java.util.*;

public class q2 {
    // 2. Write a java program to find the largest number among the three numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second Number");
        double num2 = sc.nextDouble();
        System.out.println("Enter third Number");
        double num3 = sc.nextDouble();
        double big = num1;

        if  (num1 == num2 && num2 == num3){
            System.out.println("All are same");}
        else {
            
           if (num2>big){
            big = num2;
           }

           if (num3>big){
            big=num3;
           }
           
            System.out.println("Biggest is : " + big);

        }
    }
}
