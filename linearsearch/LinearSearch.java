// import java.util.Scanner;

// public class LinearSearch {
//     int meth() {
//         int arr[] = new int[10];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n");
//         int n = sc.nextInt();
//         System.out.println("Enter the Array value");
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the Search value");
//         int v = sc.nextInt();

//         //to search
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]==v)
//             {
//                 System.out.println("Founded value will be "+arr[i]);
//                 return 0;
//             }
//         }
//         System.out.println("Not Found");
//         return -1;
        
//     }
    

//     public static void main(String[] args) {
//         LinearSearch l = new LinearSearch();
//         l.meth();

//     }
// }











//------------------------>

import java.util.Scanner;
class linear{
   public int meth() {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the Array value");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Search value");
        int v = sc.nextInt();

        //to search
        for(int i=0;i<n;i++)
        {
            if(arr[i]==v)
            {
                System.out.println("Founded value will be "+arr[i]+" at Index "+i);
                return 0;
            }
        }
        System.out.println("Not Found");
        return -1;
        
    }
    

}
public class LinearSearch {
 
    public static void main(String[] args) {
      linear s= new linear();
      s.meth();

    }
}
