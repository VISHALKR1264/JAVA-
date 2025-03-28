
// you are given an array with tast level of candy , just to find min taste lable and max taste level and the difference of that::

import java.util.Arrays;


public class taste_of_candy {
    public static int find_max(int max[],int n)
    {
        if(n<=0)
        {
            return max[0];
        }
        return Math.max(max[n-1],find_max(max,n-1));

    }
    public static int find_min(int min[],int n)
    {
        
        if(n<=0)
        {
            return min[0];
        }
        return Math.min(min[n-1],find_min(min,n-1));
    }
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 1, 3, 6, 4, 11 };
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]-arr[0]+" :--Will be the diff of candy taste level");

        //Another method uaing recursion
        int max=find_max(arr,arr.length);
        int min=find_min(arr,arr.length);
        System.out.println("Diff is : "+(max-min));

        
    }
}
