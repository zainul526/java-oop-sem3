import java.util.Scanner;
public class q9{
    public static boolean isLeap(int year){
        if((year%4==0) && (year%100!=0) || (year%400==0))
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if (isLeap(year))
            System.out.println("Year is Leap");
        else
            System.out.println("Year is not Leap Year");
    }
}