//WE have an array of size n which contain integer elements 4,2,0,1,0,3 so , all the 0 will have to be at last and allnon-zero integer it must be in row

// public class choclate_store {
    
//     public static void function(int arr[],int n)
//     {
//         int arr_new[]=new int[n];
//         int j=0;
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]!=0)
//             {
//                 arr_new[j] = arr[i];
//                 j++;
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             arr[i] = arr_new[i];
//         }

//         // Print the resulting array
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
        
//     }
//     public static void main(String[] args) {
//         int arr[];
//         arr=new int[]{2,1,0,3,0,4};
//         int n=arr.length;
//         function(arr,n);
//     }
// }





// //Using List -------------------------------------->Both the case take an additonal DataStructure O(n);
// import java.util.ArrayList;
// import java.util.List;

// public class choclate_store {

//     public static void function(int arr[], int n) {
//         List<Integer> resultList = new ArrayList<>();

//         // Add all non-zero elements to the list
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != 0) {
//                 resultList.add(arr[i]);
//             }
//         }

//         // Add zeros to the end of the list
//         while (resultList.size() < n) {
//             resultList.add(0);
//         }

//         // Print the resulting list
//         for (int i = 0; i < n; i++) {
//             System.out.print(resultList.get(i) + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 2, 0, 1, 0, 3};
//         int n = arr.length;
//         function(arr, n);
//     }
// }



//If you dont want to use another DS we had to take two pointer and swap them 
