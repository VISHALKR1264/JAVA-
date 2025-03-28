import java.util.Scanner;


public class Insert_by_pos {
    public static void insertByposition(int arr[])
    {
        int newarr[]=new int[arr.length+1];
        int index=2;
        Scanner sc = new Scanner(System.in);

        for(int i=0 ;i<newarr.length;i++)
        {
            if(i<index)
            {
                newarr[i]=arr[i];
            }
            else if(i == index)
            {
                System.out.print("Enter the number to insert: ");
                newarr[i]=sc.nextInt();
            }
            else{
                newarr[i]=arr[i-1];
            }
        }
        System.out.println("Array after insertion:");
        for (int num : newarr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[6]; //extra 1 space to insert new;
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int index=2;//pos
        int i = arr.length-2;//for acctual length;
        Scanner sc=new Scanner(System.in);
        while(i >= index)
        {
            arr[i+1]=arr[i];
            i--;
        }
        System.out.println("Enter the value to Insert");
        arr[index]=sc.nextInt();
        System.out.println("Array after insertion:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();






        ///
        int arr1[]=new int[]{2,3,4,5,6};
        insertByposition(arr1);

    }
}
