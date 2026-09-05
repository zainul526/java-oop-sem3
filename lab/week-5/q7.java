import java.util.*;
public class q7 {
    //7. Write a Java program to find the largest element in a given integer array
    public static int largest(int n, int arr[] ){
        int big = arr[0];
        for(int i=1 ; i< n; i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }
        return big;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter Elements one by one:");
        for(int i=0; i<num; i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Your Array is :");
        for(int i=0 ; i<num;i++ ){
            if(i==num-1)
            System.out.print(a[i]);
        else 
            System.out.print(a[i]+", ");
        }
        int large= largest(num, a);
        System.out.println();
        System.out.println("Biggest element is : "+ large);

    }
}
