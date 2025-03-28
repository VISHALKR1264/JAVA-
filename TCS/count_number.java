// package TCS;
//There is an array[] of size N ,we had to just count the number of element in that array such that all the element to its left is strictly smaller than it.
//NOTE:--the first elememt will always satisy the condition ,as it doesn't have any things in left of him
//ans->>we will traverse 0--->n and check with every element left's that the current element is have to greater than from its left element 
// public class count_number { //------------->wrong approch

//     public static int count_function(int arr[], int n) {
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 1; j < n; j++) {

//                 if (arr[j] > arr[i]) {
//                     count++;
//                 }
//             }

//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2,2,4,5};
//         int n = arr.length;
//         int result = count_function(arr, n);
//         System.out.println(result);
//     }
// }



// //More refined and fast--->But geting wrong o/p as if 1st and 2nd element will same then,
public class count_number {
    public static int countElements(int[] arr) {
        int count = 1; // The first element always satisfies the condition
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 5, 6};
        System.out.println("Count of elements where all elements to its left are strictly smaller: " + countElements(arr));
    }
}


// public class count_number {
//     public static int count_function(int arr[], int n) {
//         int count = 1; // The first element always satisfies the condition

//         for (int i = 1; i < n; i++) {
//             boolean isGreater = true;
//             for (int j = 0; j < i; j++) {
//                 if (arr[i] <= arr[j]) {
//                     isGreater = false;
//                     break;
//                 }
//             }
//             if (isGreater) {
//                 count++;
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int arr[] = {-2, 2, 4, 5};
//         int n = arr.length;
//         int result = count_function(arr, n);
//         System.out.println(result);
//     }
// }
