public class easy268v1 {
    static int missingNumber(int[] nums) {
    int missing = 0;

    for (int i = 0; i < nums.length; i++) {
        missing += i - nums[i]+1;
    }

    return missing;
}
        
    
    public static void main(String[] args) {
        int arr[]= {0,1};
        System.out.println(missingNumber(arr));
    }
}
