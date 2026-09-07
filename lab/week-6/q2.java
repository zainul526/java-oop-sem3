import java.util.*;
public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int count=0;
        for(i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("Number is not Prim");
        }
        else
        {System.out.println("Number is prime");}
    }
    
}
