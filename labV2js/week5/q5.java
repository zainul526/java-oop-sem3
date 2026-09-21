// public class q5{
//     public static int Sum(int number){
//         int sum =0;
//         int dig = 0;
//         while(number>0){
//             dig = number%10;
//             sum+=dig;
//             number/=10;
//         }
//         return sum;
//     }
//         public static void main(String[] args){
//             int num = 765;
//              int res = Sum(num);
//              System.out.println(res);
//     }
// }
public class q5{
    public static int sum(int num){
        int sum =0;
        if(num<=0)
            return sum;

        else 
            return num%10+sum(num/10);
    }
    public static void main(String[] args){
        int num = 764;
        int res= sum(num);
        System.out.println(res);
    }
}

