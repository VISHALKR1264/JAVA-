import java.util.ArrayList;
import java.util.List;

public class maximum_substring {
    List<List<Integer>> result=new ArrayList<>();
    int maxSum = Integer.MIN_VALUE;
    List<Integer> maxSubset = new ArrayList<>();
    void subarray(int i,int arr[],List<Integer>temp)
    {
        if (i>=arr.length) {
            result.add(new ArrayList<>(temp));
            //------->For Max Subset Sum
            int sum=0;
            for(int num : temp)
            {
                sum+=num;
            }
            if(sum > maxSum)
            {
                maxSum=sum;
                maxSubset = new ArrayList<>(temp);
            }
            //------->
            System.out.println(temp);
            return;
        }
        temp.add(arr[i]);
        subarray(i+1,arr,temp);
        temp.remove(temp.size()-1);
        subarray(i+1,arr,temp);        
        
    }
    public static void main(String[] args) {
        maximum_substring mc=new maximum_substring();
        int arr[]=new int[]{2,3};
        List<Integer>temp=new ArrayList<>();
        mc.subarray(0,arr,temp);
        System.out.println("Subset with the maximum sum: " + mc.maxSubset);
        System.out.println("Maximum sum: " + mc.maxSum);

    }
}






// //WITHOUT 'RECURSION'
// import java.util.ArrayList;
// import java.util.List;

// public class maximum_subarray {
//     List<List<Integer>> result = new ArrayList<>();
//     int maxSum = Integer.MIN_VALUE;
//     List<Integer> maxSubset = new ArrayList<>();

//     void findSubarrays(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             List<Integer> temp = new ArrayList<>();
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 temp.add(arr[j]);
//                 //sum += arr[j];
//                 result.add(new ArrayList<>(temp)); // Add the current subarray to the result list

//                 // Update maxSum and maxSubset if the current sum is greater
//                 if (sum > maxSum) {
//                     maxSum = sum;
//                     maxSubset = new ArrayList<>(temp);
//                 }

//                 System.out.println(temp);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         maximum_subarray ms = new maximum_subarray();
//         int[] arr = new int[]{2, 3};
//         ms.findSubarrays(arr);
//         System.out.println("Subset with the maximum sum: " + ms.maxSubset);
//         System.out.println("Maximum sum: " + ms.maxSum);
//     }
// }
