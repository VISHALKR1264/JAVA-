import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * maximumProductOf_ThreeNo
 */
public class maximumProductOf_ThreeNo {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int pro1=nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        int pro2=nums[0] * nums[1] * nums[nums.length-1];   //to deal with negative sign values
        return Math.max(pro1,pro2);
    }
    public static void main(String[] args) {
        
        int arr[]=new int[]{3,4,1,2};
        System.out.println(maximumProduct(arr));
    }
}