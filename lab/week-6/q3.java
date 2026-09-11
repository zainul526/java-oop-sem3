import java.util.Scanner;
public class q3 {
    //3. Write a Java program to swap the first and last elements of an array.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements");
        for(int i=0; i<size; i ++){
            arr[i]=sc.nextInt();
        }
           int t = arr[0];
           arr[0] = arr[arr.length-1];
           arr[arr.length-1]= t;
           System.out.println("After changing first and last Element\n Your Array is below: ");
           for(int e:arr){
            System.out.print(e+" ");
           }
    }
}
