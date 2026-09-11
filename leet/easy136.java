public class easy136 {
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.  

static int single(int arr[]){
    int sing = 0;
    for(int i=0; i<arr.length; i++){
       sing = sing ^arr[i];
        
    }
    return sing;
}
public static void main(String[] args) {
    int num[] = {66, 56, 87, 56, 66};
    System.out.println(single(num));
}
}
