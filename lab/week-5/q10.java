import java.util.*;
public class q10 {
    //10. Write a Java program to convert a decimal number into Hexadecimal number and vice-versa.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number");
        int number = sc.nextInt();
        int carry = 0;
        String hexa = "";
        if(number<=0){
            System.out.println("Enter positive Number");
        }
        else{
            while(number>0){
            carry = number%16;
            if(carry<10)
            {hexa = carry+hexa;}
            else{
                if(carry ==10)
                    hexa='A'+hexa;
                else if(carry ==11)
                    hexa='B'+hexa;
                else if(carry ==12)
                    hexa='C'+hexa;
                else if(carry ==13)
                    hexa='D'+hexa;
                else if(carry ==14)
                    hexa='E'+hexa;
                else if(carry ==15)
                    hexa='F'+hexa;
            }
            number = number/16;
}
System.out.println("Hexadecimal is : "+hexa);
        }

        

        
    }
}
