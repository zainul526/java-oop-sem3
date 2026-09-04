//7. Write a Java program to find the smallest number among four given numbers.

public class q7{
    public static void main(String[] args){
        double num1 = 5;
        double num2 = 5;
        double num3 = 5;
        double num4 = 5;
        
        double big = num1;
if (num1 == num2 && num2 == num3 && num3==num4) {
    System.out.println("All numbers are equal");
}
else{
    if (num2>big){
        big = num2;
    }
    if(num3>big){
        big = num3;
    }
    if(num4>big){
        big = num4;
    }
     System.out.println("Biggest among is : "+ big);
}
       
    }
}