import java.util.*;

public class q4 {
    // 4. Write a java program to find the sum of following series where n is input
    // by the user.
    // 1+1/2+1/3+1/4+...............+1/n.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of element in the series: ");
        int n = sc.nextInt();
        String a[] = new String[n];
        int i = 1;
        double sum = 0;
        for (i = 0; i < n; i++) {
            a[i] = "1/" + (i + 1);
            if (i == n - 1)
                System.out.print(a[i]);
            else
                System.out.print(a[i] + " + ");
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            sum = sum + (1.0 / (i + 1));

        }
        System.out.println("Sum of the Series is  : " + sum);
    }
}
