//Binary search Iteratively
// import java.util.Scanner;

// class BinarySearch {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of no. of Input");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the value in an array");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the value to be search");
//         int v = sc.nextInt();
//         int l = 0;
//         int h = n-1;
//         while (l <= h) {
//             int mid = (l + h) / 2;
//             if (arr[mid] == v) {
//                 System.out.println("The search value is found" + arr[mid]);
//             }
//             else

//             if (v < arr[mid]) {
//                 h=mid-1;
//             }
//             else
//             {
//                 l=mid+1;
//             }
//         }
//         System.out.println("Not found");
//     }
// }

import java.util.Scanner;

class binary {
    int search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of no. of Input");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value in an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be search");
        int v = sc.nextInt();
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == v) {
                return arr[mid];
            } else

            if (v < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}

class BinarySearch {
    public static void main(String[] args) {
        binary b = new binary();
        int result = b.search();
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element founded " + result);
        }
    }

}