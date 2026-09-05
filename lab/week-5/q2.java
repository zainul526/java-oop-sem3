import java.util.*;
public class q2 {
//2. Write a Java program to calculate the sum of all the array elements.

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elemets you are going to enter");
    int num = sc.nextInt();
    int [] arr = new int[num];
    int i=0;
    long sum=0;
    System.out.println("Enter Elements: ");
        for(i=0; i<num; i++){
            arr[i]= sc.nextInt();
    }

    System.out.println("The Sum of Your Array is below: ");
    for(i=0; i<num; i++){
        sum+=arr[i]; 
       
    }
     System.out.print("The Sum is : "+ sum);
}
}
