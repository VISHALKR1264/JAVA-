import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class swap {
    public static List<Integer> swapList(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return Arrays.asList(a, b);

    }

    public static int[] swapArray(int a, int b) {
        // int temp = a;
        // a = b;
        // b = temp;
        a=a^b;
        b=a^b;
        a=a^b;
        return new int[] { a, b };
    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(swapList(a, b));
        System.out.println(Arrays.toString(swapArray(a, b)));
    }

}
