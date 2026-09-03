import java.util.*;
public class q5 {
    // 5. Write a Java program to compute the distance between two points.
public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your x value of First point");
 double x1 = input.nextDouble();
 System.out.println("Enter your y value of First point");
 double y1 = input.nextDouble();
 System.out.println("Enter your x value of second point");
 double x2= input.nextDouble();
  System.out.println("Enter your y value of second point");
 double y2 = input.nextDouble();
 

 double dist = Math.sqrt(Math.pow((y2-y1), 2)+Math.pow((x2-x1), 2));
 System.out.print("The distance between ("+x1+","+y1+") & ("+x2+ ","+ y2+") is : "+ dist);
}
}
