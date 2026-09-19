// 4. Write a Java program that takes three numbers as input to calculate and print the average of the
// numbers.
import java.util.Scanner;
public class q4 {
    public static void main(String [] args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i=1; i<=20; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
        
    }
}
