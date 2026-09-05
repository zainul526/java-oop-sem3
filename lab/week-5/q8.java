import java.util.*;
public class q8 {
    //8. Write a Java program to reverse the digits of a given integer
    public static int reverse(int num){
        int dig = 0;
        int current = num;
        int rev = 0;
        while(current>0){
            dig = current%10;
            rev = 10*rev+ dig;
            current/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Number  ");
     int number = sc.nextInt();
     if(number<0)
        System.out.println("Enter positive number ");
    else
     {System.out.print("Reverse of "+number + " is: ");   
     System.out.println(reverse(number));}
    }
}
