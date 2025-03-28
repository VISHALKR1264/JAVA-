import java.util.Arrays;

public class unique_count {
    public static void main(String[] args) {
        int[] arr = {10, -2, -1,-1,3, 7, -5, 8, 0, -1, 4,11,11,11, 6};
        Arrays.sort(arr);

        int unique_count=0;
        for(int i=0;i<arr.length;i++)
        {
            if (i==0 || arr[i] != arr[i-1]) {
                System.out.print(arr[i]+" ,");
                unique_count++;
            }
        }
        System.out.println("Unique_count  "+unique_count);
    }
}
