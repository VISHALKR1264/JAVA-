import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> result=new ArrayList<>();
    void solve(int i,int[]nums, List<Integer>temp)
    {
        if(i>=nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(i+1,nums,temp);
        temp.remove(temp.size()-1);
        solve(i+1,nums,temp);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        solve(0,nums,temp);
        return result;

    }
}
    public class substring {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Define a sample input array
        int[] nums = {2, 3};

        // Call the subsets method and store the result
        List<List<Integer>> subsets = solution.subsets(nums);

        // Print the result
        System.out.println("Subsets of the given array:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}

