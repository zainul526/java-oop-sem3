import java.util.*;
public class q9 {
    //9. Write a Java program to check whether a given year is a leap year or not.
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Year");
long year = sc.nextLong();
if((year%4==0&&year%100!=0)||(year%400==0)){
    System.out.println("Year is leap");
}
else {System.out.println("Not aleap year");}
}
}
