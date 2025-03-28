import java.util.*;

public class second_largest {
    public static int find_second_smallest(int arr[]) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        } else {
            Arrays.sort(arr);
            int i = 0;
            while (i < n) {
                if (arr[i] < arr[i + 1]) {
                    return arr[i + 1];
                }
                i++;
            }
        }
        return 0;

    }

    public static int find_second_largest(int arr[]) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        } else {
            Arrays.sort(arr);
            int i = n - 2;
            while (i >= 0) {
                if (arr[i] < arr[n - 1]) {
                    return arr[i];
                }
                i--;
            }

        }
        return 0;
    }
    public static int find_second_smallest_smart(int arr[]) 
    {
        Set <Integer> ss = new HashSet<>();
        for(int num : arr)
        {
            ss.add(num);
        }
        Iterator<Integer> itr = ss.iterator();

        if(itr.hasNext()) {
            itr.next();
        }
        if (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        return 0;

    }

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 3, 4, 5, 5 };

        System.out.println("Second Smallest Element "+find_second_smallest(arr));
        System.out.println("Second Largest Element "+find_second_largest(arr));
        find_second_smallest_smart(arr);
    }
}
