import java.util.*;

public class q8 {

    //8. Write a Java program to convert temperature from Celsius to Fahrenheit
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temp in Celsiuis: ");
    double cels = sc.nextDouble();
    double fer = ((9*cels)/5.0 + 32);
    System.out.println(cels+ " degree Celsius is : "+ fer+" Fahrenheit" );        
    }
    
}
