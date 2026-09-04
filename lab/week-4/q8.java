//8. Write a Java program to calculate the sum of all even numbers from 1 up to a given number N.
import java.util.*;
public class q8{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = sc.nextInt();
    long sum = 0;
    int i = 1;
    while(i<=num){
        
        if (i%2==0){
            sum = sum+i;
            }
            i+=1;
    }
    
    System.out.println("The sum of even number up to "+num+" is : "+sum);
}
}