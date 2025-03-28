
/*
 * You are given an array nums consisting of positive integers.

Starting with score = 0, apply the following algorithm:

Choose the smallest integer of the array that is not marked. If there is a tie, choose the one with the smallest index.
Add the value of the chosen integer to score.
Mark the chosen element and its two adjacent elements if they exist.
Repeat until all the array elements are marked.
Return the score you get after applying the above algorithm.

 

Example 1:

Input: nums = [2,1,3,4,5,2]
Output: 7
Explanation: We mark the elements as follows:
- 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,1,3,4,5,2].
- 2 is the smallest unmarked element, so we mark it and its left adjacent element: [2,1,3,4,5,2].
- 4 is the only remaining unmarked element, so we mark it: [2,1,3,4,5,2].
Our score is 1 + 2 + 4 = 7.
 */

class FindScore {
    public static long findScore(int[] nums) {
        
        long sum=0;
        boolean[] marked = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {

            int index = -1;
            int val =Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (!marked[j] && nums[j] < val) {
                    val = nums[j];
                    index = j;
                }
            }

            // MARKING ADJACENT;
            if (index != -1) {
                marked[index] = true;
                if (index - 1 >= 0)
                    marked[index - 1] = true;
                if (index + 1 < nums.length)
                    marked[index + 1] = true;
                sum += val;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,1,3,4,5,2};

        System.out.println(findScore(arr));
    }
}