public class easy268 {
    static int missingNumber(int[] nums) {
        int missing = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missing = missing ^ i ^ nums[i];
        }

        return missing;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,0,1,4};
        System.out.println(missingNumber(arr));
    }
}