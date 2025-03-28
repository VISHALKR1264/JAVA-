// class Solution 
// {
//     public int[] twosum(int[] nums, int target) {
//         for(int i=0;i<=nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]+nums[j] == target)
//                 {
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{-1,-1};
//     }
// }



import java.util.Arrays;

class twosum {
    public int[] twosum(int[] nums, int target) {
        int sortarray[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortarray);
        System.out.println("sorted array: " + Arrays.toString(sortarray));

        int left = 0;
        int right = sortarray.length - 1;

        for (int i = 0; i < sortarray.length; i++) {
            int currentsum = sortarray[left] + sortarray[right];
            if (currentsum == target) {
                int index1 = indexOf(nums, sortarray[left]);
                int index2 = indexOf(nums, sortarray[right]);
                return new int[] { index1, index2 };
            } else {
                if (currentsum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new int[] { -1, -1 };
    }

    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        twosum s=new twosum();
        int nums[] = { 3, 1, 45, 7 };
        int target = 48;
        int result[] = s.twosum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices of the two numbers that sum up to the target: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }


}
// //using hashmap by chatgpt
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

// class twosum {
//     public int[] twosum(int[] nums, int target) {
//         // Create a HashMap to store the indices of elements
//         Map<Integer, Integer> indexMap = new HashMap<>();

//         // Iterate through the array
//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];

//             // Check if the complement exists in the HashMap
//             if (indexMap.containsKey(complement)) {
//                 // Return the indices if found
//                 return new int[] { indexMap.get(complement), i };
//             }

//             // Otherwise, add the current element and its index to the HashMap
//             indexMap.put(nums[i], i);
//         }

//         // Return [-1, -1] if no solution is found
//         return new int[] { -1, -1 };
//     }

//     public static void main(String[] args) {
//         twosum s = new twosum();
//         int nums[] = { 3, 1, 45, 7 };
//         int target = 48;
//         int result[] = s.twosum(nums, target);

//         if (result[0] != -1) {
//             System.out.println("Indices of the two numbers that sum up to the target: [" + result[0] + ", " + result[1] + "]");
//         } else {
//             System.out.println("No solution found.");
//         }
//     }
// }
