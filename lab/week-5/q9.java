import java.util.*;
public class q9 {
    //9. Write a Java program to check if a given number is a palindrome or not.
    public static boolean isPalin(int org){
        int num = org;
        int rev =0;
        int dig = 0;
        while(num>0){
            dig=num%10;
            rev=rev*10+dig;
            num/=10;

        }
        return org == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int number = sc.nextInt();
        if(number<0){
            System.out.println("Enter positive number");
            
        }
        else{
        if (isPalin(number)){
            System.out.println(" Number is Palindrom");
        }
        else
            System.out.println("Not a palindrom");
}
    }


}
