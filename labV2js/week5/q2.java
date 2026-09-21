public class q2{
    public static int Sum(int arr[]){
        int sum=0;
        for(int i =0; i<=arr.length-1; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int a[]={45,65,34};
        System.out.println(Sum(a));
    }
}