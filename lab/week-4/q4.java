import java.util.*;
public class q4 {
//  4. Write a Java program to calculate the sum of following series:
// 1 + 2 + 3 + 4 + ..........
// + N
public static void main (String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Number ");
 int num = sc.nextInt();

 long sum = (num*(num+1))/2;

 System.out.println("Sum of first "+num+" Natural number is : "+sum);
}
    
}
