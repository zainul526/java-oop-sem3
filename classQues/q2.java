package classQues;

public class q2 {
    //print sum , sub, multip, devide of two num
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int multip(int a, int b){
        return a*b;
    }
    public static float devide(float a, float b){
        return a/b;
    }
    public static void main(String[] args) {
        int num1 = 87;
        int num2 = 45;
        System.out.println(sum(num1, num2));

        System.out.println(sub(num1, num2));
        System.out.println(multip(num1, num2));
        System.out.println(devide(num1, num2));
    }
}
