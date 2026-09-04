import java.util.*;

public class q10 {
    //10. Write a Java program that takes a number as input and prints all its factors.
    
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        long num = sc.nextLong();

        if(num<0){
            System.out.println("Enter Positive Number");

        }
        else{
            long i = 1;
            System.out.println("Factors are : ");
                while(i<=num){
                    if(num%i==0){
                        System.out.println(i+ " ");
                    }
                    i++;
                }
        }
    }
}
