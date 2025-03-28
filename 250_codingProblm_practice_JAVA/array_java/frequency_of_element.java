import java.util.Arrays;

public class frequency_of_element {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,4,4,5,5};
        
        int frequency[]=new int[100];
        for(int i=0;i<arr.length;i++)
        {
            frequency[arr[i]]++;
        }

        for(int i=0;i<arr.length;i++)
        {
            if (frequency[i] > 0) {
                System.out.println(i +" : "+frequency[i]);
            }
        }
    }
}
