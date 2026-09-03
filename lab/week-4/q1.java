import java.util.*;
public class q1 {
    //1. Write a java program to check whether the given number is odd or even.
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    double num = sc.nextDouble();

    if (num%2==0){
        System.out.println(num+" is Even ");
    }
    else System.out.println(num +" is Odd");
}
}
