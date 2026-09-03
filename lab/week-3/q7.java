import java.util.*; 
public class q7 {
    //7. Write a Java program to calculate the area of a rectangle given its length and breadth.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double breadth = sc.nextDouble();
        double area = length*breadth;
        System.out.println("Area is : "+ area);
    }
    
}
