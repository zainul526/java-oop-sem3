public class easy {
    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*nums.length];
        for(int i =0; i<=nums.length-1; i++){
            ans[i]=nums[i];
        }

        for(int i=0; i<=nums.length-1; i++){
            ans[nums.length+i]=nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int ar[] = {1, 2,3,4};
        int ans = getConcatenation(ar[]);
        System.out.println(ans);
    }
    
}