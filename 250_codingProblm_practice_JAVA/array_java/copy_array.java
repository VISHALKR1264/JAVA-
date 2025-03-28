import java.util.Arrays;

public class copy_array {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        int newarr[] = new int[arr.length];
        // System.arraycopy(arr,0,newarr,0,arr.length);
        // System.out.println(Arrays.toString(newarr));

        for(int i=0;i<arr.length;i++)
        {
            newarr[i]=arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }

}
