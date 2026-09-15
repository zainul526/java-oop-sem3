import java.util.Scanner;
public class q3 {
    // print table up to 10, by taking input as number
    public static void table(int n){
        for(int i=1; i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        table(num);
    }
}
