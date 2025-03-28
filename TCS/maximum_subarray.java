public class maximum_subarray {

    public static int maxSubArray(int[] nums) {
        int curr = 0;
        int Minsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            Minsum = Math.max(curr, Minsum);
            if (curr < 0) {
                curr = 0;
            }
        }
        return Minsum;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=maxSubArray(arr);
        System.out.println("SUM of Largest SubArray "+maxSum);
    }
}
