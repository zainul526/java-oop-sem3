public class q1{
    public static void main(String[] args){
        int arr[] = {10,20,20};
        for(int i =0 ; i<=arr.length-1; i++){
            if(i==arr.length-1){
            System.out.println(arr[i]);}
            else
                System.out.print(arr[i]+", ");
        }
    }
}