import java.util.*;
public class q10 {
    //10. Write a Java program to find the circumference of a circle given its radius.
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius ");
    double radius = sc.nextDouble();
    double circum = 2*Math.PI*radius;
    System.out.println("Circumference of the Circle of "+ radius + " radius is : "+circum);
}
}
