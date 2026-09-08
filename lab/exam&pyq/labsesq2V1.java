import java.util.*;

public class labsesq2V1 {
    // sum of first and last digit of an integer
    public static void main(String[] args) {
        // have to complete later or tomorrow

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int lastDig = num % 10;
        int FirstDig = 0;
        while (num > 0) {
            if (num < 10) {

                 FirstDig = num;
                 break;
            } else
                num = num / 10;
        }
        System.out.println("The sum of First and  Last digit is: " + (lastDig + FirstDig));
    }
}
