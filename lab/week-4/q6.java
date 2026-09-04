//6. Write a Java program to check whether a given character is a vowel or consonant.
import java.util.*;
public class q6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        
        if ((ch<65 || ch >90)&& (ch<97||ch>122)){
            System.out.println("Please Enter an English Character");}
        else{
        if (ch=='a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u' || ch == 'A' ||ch=='E' || ch == 'I' || ch == 'O' ||ch=='U' ){
            System.out.println("Given character is Vowel");}
        else
                System.out.println("Character is Consonent");
        }
    }
}