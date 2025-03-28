import java.util.Arrays;
import java.util.HashSet;

public class remove_duplicate_element {
    private static int convertArrayToInt(int[] array) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number = number * 10 + array[i]; // Shift left and add the next digit
        }
        return number;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 3, 4, 5, 6, 7, 7 };
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        // Set back to array
        int result[] = hs.stream().mapToInt(Integer::intValue).toArray();

        int singleInteger = convertArrayToInt(result);

        System.out.println(Arrays.toString(result));
        System.out.println(singleInteger);

    }

}
