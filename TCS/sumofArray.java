import java.util.Arrays;

public class sumofArray {
    public static int sumarray(int arr[],int n)
    {
        if(n <= 0)
        {
            return 0;
        }
        return (sumarray(arr, n-1)+arr[n-1]);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int sum=0;
        for(int num : arr)
        {
            sum+=num;
        }
        System.out.println(sum);

        System.out.println("SUM OF AN ARRAY 2nd METHOD "+sumarray(arr,arr.length));


        int sumarray=Arrays.stream(arr).sum();
        System.out.println("SUM OF AN ARRAY 3rd METHOD "+sumarray);
    }
}
