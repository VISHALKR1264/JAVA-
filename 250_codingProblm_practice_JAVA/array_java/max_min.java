import java.util.Arrays;

public class max_min {
    public static int max_recursion(int arr[], int n) {
        if (n <= 0) {
            return arr[0];
        }
        return Math.max(arr[n - 1], max_recursion(arr, n - 1));

    }

    public static int min_recursion(int arr[], int n) {
        if (n <= 0) {
            return arr[0];
        }
        return Math.min(arr[n - 1], min_recursion(arr, n - 1));
    }

    public static void main(String[] args) {

        int arr[] = new int[] { -1, 1, 2, 3 };
        int max = max_recursion(arr, arr.length);
        int min = min_recursion(arr, arr.length);
        System.out.println("Max element is " + max);
        System.out.println("Min element is " + min);

        // Another Method to Find the MAX and Min using for loop

        int max_for = arr[0], min_for = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max_for = Math.max(max_for, arr[i]);
            min_for = Math.min(min_for, arr[i]);
        }
        System.out.println("Max element using LOOP is " + max_for);
        System.out.println("Min element using LOOP is " + min_for);

        // Another Method:

        int max_stream = Arrays.stream(arr).max().orElseThrow();
        int min_stream = Arrays.stream(arr).min().orElseThrow();
        System.out.println("Max element using Stream is " + max_stream);
        System.out.println("Min element using Stream is " + min_stream);
    }
}
