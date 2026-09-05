import java.util.*;
public class q5 {
    //5. Write a Java program and compute the sum of the digits of an integer.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number only integer Number");
        long num = sc.nextLong();
        long i = 0;
        long digit = 0;
        long sum = 0;
        long current = num;
        if(num<0){
            System.out.println("Enter only Positive Integer: ");
        }

        else{
        while(current!=0){
            digit = current%10;
             sum = sum+digit;
             current = current/10;
        }
        
        System.out.println("The sum of the digits of "+num+" is : "+ sum);
    }
    }
}
