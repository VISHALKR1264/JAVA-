//In an array a sprior element is that which is greater than all its element from its right
//[795287]----------->7,8,9 are suprior element (Total 3) checking from right to left<--
public class suprior_array_element {

    public static void main(String[] args) {
        int count = 1;
        int arr[] = new int[] { 7, 9, 5, 2, 8, 7 };
        int n = arr.length;
        int maxright=arr[n-1];
        if (n == 0) {
            System.out.println("Empty Array ");
            return;
        } else {
            for (int i = n - 2; i >= 0; i--) {
                
                if (arr[i] > maxright) {
                    count++;
                    maxright=arr[i];
                }

            }
            System.out.println( count);
        }

    }
}