import java.util.Scanner;

public class dlt_by_pos {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,4,5,6,7};
        int newarr[]=new int[arr.length-1];
        int index=2;
        Scanner sc = new Scanner(System.in);

        for(int i=0,j=0;i<arr.length;i++)
        {
            if (i != index) {
               newarr[j++]=arr[i];
            }
        }
        System.out.println("Array after deletion");
        for (int num : newarr) {
            System.out.print(num + " ");
        }
    }
}
