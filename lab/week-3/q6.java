import java.util.*;

public class q6 {
//6. Write a Java program to swap two numbers using a temporary variable.

public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age of Anash: ");
    double Anash = sc.nextDouble();
    System.out.print("Enter age of Zain: ");
    double Zain = sc.nextDouble();
System.out.println("You Entered \n Anas: "+Anash+" Zain: "+Zain);

double temp = Anash;
 Anash = Zain;
Zain = temp;
System.out.println("Ohh sorry Correct must be As");
System.out.print("Anas: "+Anash+" Zain: "+Zain);
}
}
