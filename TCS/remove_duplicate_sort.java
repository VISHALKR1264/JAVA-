import java.util.*;
public class remove_duplicate_sort {

    public static void main(String[] args) {
        int[] array = { 4, 2, 9, 2, 4, 1, 5, 9 };
        Set<Integer> sc = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            sc.add(array[i]);
        }
        System.out.println(sc);
        int index = 0;
        int result[] = new int[sc.size()];
        for (Integer num : sc) {
            result[index++] = num;
        }
        for (int j = 0; j < result.length; j++) {
            if(j>0)
            {
                System.out.print(" ,");
            }
            System.out.print(result[j]); 
        
        }

    }

}
