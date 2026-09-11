import java.util.*;

public class q2 {
    // 2. Write a Java program to check whether a number is prime or not.
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere number to check");
        int num = sc.nextInt();
        if (num == 0)
            if (isPrime(num)) {
                System.out.println(" Number is Prime ");
            } else
                System.out.println(" Number is not Prime");
    }

}