import java.util.*;
public class q9 {
    //9. Write a Java program that takes two integer inputs and computes their remainder and quotient.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divident");
        double divd = sc.nextDouble();
        System.out.println("Enter Diviser");
        double divs = sc.nextDouble();
        double rem = divd%divs;
        double quo = divd/divs;
        System.out.println( "Remainder is : "+rem);
        System.out.println("Quotient is : "+quo);
    }
    
}
