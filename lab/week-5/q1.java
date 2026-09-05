import java.util.*;

public class q1{
    //1. Write a Java program to insert 10, 20, 30 ....in an array and display them
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of Elemenet You want to display");
     int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter the elements");
        int i=0;
        for( i=0; i<num ; i++){
            a[i] = sc.nextInt();
            
        }
        System.out.println("Elements are  :");
        for(i = 0; i<num ; i++){
            System.out.print(a[i]+" ");
        }
    }
}