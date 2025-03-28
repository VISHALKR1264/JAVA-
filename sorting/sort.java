// // //------------------------------------------------------------------------->
// // //BUBBLE SORT

// public class sort {
//     public static void main(String[] args) {
//         int temp = 0;
//         int arr[] = { 21, 3, 22, 65, 43, 76, 29, 65 };
//         for (int i = 0; i < arr.length; i++) {
//             int flag = 0;
//             for (int j = 0; j < arr.length - 1 - i; j++)// -i will left the last one in every loop
//             {
//                 if (arr[j] > arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     flag = 1;
//                 }
//             }
//             // if all are sorted but round is left out this loop remove that round
//             if (flag == 0) {
//                 break;
//             }
//         }
//         for (int k = 0; k < arr.length; k++) {
//             System.out.println(arr[k]);
//         }

//     }
// }

// //-------------------------------------------------------------------------------------->
// //selection sort

// public class sort {
//     public static void main(String[] args) {
//         int temp;
//         int arr[] = { 12, 32, 43, 52, 87 };
//         for (int i = 0; i < arr.length - 1; i++) {
//             int min = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[min] > arr[j]) {
//                     min = j;// i=j;//serching for the sortest element
//                 }
//             }

//             temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;

//         }

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i] + " ");
//         }

//     }

// }

// //-------------------------------------------------------------------------------------------->
// // //Insertion sort
// class sort {
// public static void main(String[] args) {
// int arr[] = { 32, 34, 56, 2, 32, 11, 54, 67, 22 };
// int temp, j;
// for (int i = 1; i < arr.length; i++) {
// temp = arr[i];
// j = i;
// while (j > 0 && arr[j - 1] > temp) {
// arr[j] = arr[j - 1];
// j = j - 1;
// }
// arr[j] = temp;
// }
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i] + " ");
// }
// }
// }

// //------------------------------------------------------>
// // // //insertoion sort
// class sort {
// public static void main(String[] args) {
// int temp, j;
// int arr[] = { 21, 11, 1, 2, 32, 2, 45, 32, 65, 46, 88 };
// for (int i = 1; i < arr.length; i++)// i=1 bcz first one is already sorted
// // when we insert any digit
// {
// temp = arr[i];
// for (j = i - 1; j >= 0; j--) {
// // System.out.println("Value of j is"+j);
// if (arr[j] > temp) {
// // System.out.println("Value of temp is"+temp);

// arr[j + 1] = arr[j];// shifting
// } else {
// break;
// }
// }
// arr[j + 1] = temp;// placing
// }

// for (int k = 0; k < arr.length; k++) {
// System.out.println(arr[k]);
// }
// }
// }

// //-------------------------------------------------------------------------------------->
// //merge sort
class sort {
    int[] array;
    int[] tempmerge;
    int length;

    public static void main(String[] args) {
        int[] arr = { 21, 23, 41, 12, 11, 34, 12, 76, 31, 1, 0 };
        sort sc = new sort();
        sc.sortt(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public void sortt(int arr[]) {
        this.array = arr;
        this.length = arr.length;
        this.tempmerge = new int[length];// temperaray array;
        dividearray(0, length - 1);

    }

    public void dividearray(int lowerindex, int higherindex) {
        if (lowerindex < higherindex) {
            int middle = lowerindex + (higherindex - lowerindex) / 2;
            // it will sort the left side of an array
            dividearray(lowerindex, middle);

            // it will sort the right side
            dividearray(middle + 1, higherindex);
            mergearray(lowerindex, middle, higherindex);
        }
    }

    public void mergearray(int lowerindex, int middle, int higherindex) {
        for (int i = lowerindex; i <= higherindex; i++) {
            tempmerge[i] = array[i];// putting same value to tempaarray

        }
        int i = lowerindex;
        int j = middle + 1;
        int k = lowerindex;
        while (i <= middle && j <= higherindex) {
            if (tempmerge[i] <= tempmerge[j]) {
                array[k] = tempmerge[i];
                i++;
            } else {
                array[k] = tempmerge[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempmerge[i];
            k++;
            i++;
        }

    }
}

// //--------------------------------------------------------------------------------->
// //Quicksort
// class sort {
//     public static void main(String[] args) {
//         int[] arr = { 21, 12, 11, 43, 22, 54, 32, 34, 27, 23 };
//         int length = arr.length;
//         sort s = new sort();
//         s.quick_sort_recursion(arr, 0, length - 1);
//         s.printarray(arr);
//     }

//     int partition(int[] arr, int low, int high) {
//         int pivot = arr[(low + high) / 2];// mid element;
//         while (low <= high) {
//             // if both while fails then swap occur
//             while (arr[low] < pivot) {
//                 low++;
//             }
//             while (arr[high] > pivot) {
//                 high--;
//             }
//             if (low <= high) {
//                 int temp = arr[low];
//                 arr[low] = arr[high];
//                 arr[high] = temp;
//                 low++;
//                 high--;
//             }
//         }
//         return low;
//     }

//     void quick_sort_recursion(int[] arr, int low, int high) {
//         int pi = partition(arr, low, high);
//         if (low < pi - 1) {
//             quick_sort_recursion(arr, low, pi - 1);
//         }
//         if (pi < high) {
//             quick_sort_recursion(arr, pi, high);
//         }
//     }

//     void printarray(int[] arr) {
//         for (int i : arr) {
//             System.out.println(i + " ");

//         }
//     }
// }

// // //------------------------------------------------------------------------------------------>
// // //Heap sort
// class sort {
//     public static void main(String[] args) {
//         int arr[] = { 21, 11, 1, 43, 54, 26, 76, 32, 65, 23 };
//         sort sc = new sort();
//         sc.sorting(arr);
//         sc.printarray(arr);
//     }

//     void sorting(int arr[]) {
//         int leng = arr.length;
//         for (int i = (leng / 2) - 1; i >= 0; i--) {
//             heaptify(arr, leng, i);
//         }
//         for (int i = leng - 1; i >= 0; i--)// swap last element and heapify again
//         {
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;
//             heaptify(arr, i, 0);
//         }
//     }

//     void heaptify(int[] arr, int n, int i)// n->length,i->parent node index
//     {
//         int largest = i;// parent node index pos.
//         int li = 2 * i + 1;// left child index pos.
//         int ri = 2 * i + 2;// Right child index pos.
//         if (li < n && arr[li] > arr[largest]) {
//             largest = li;
//         }
//         if (ri < n && arr[ri] > arr[largest]) {
//             largest = ri;
//         }
//         if (largest != i)// for interchange the node
//         {
//             int temp = arr[i];
//             arr[i] = arr[largest];
//             arr[largest] = temp;
//             heaptify(arr, n, largest);
//         }
//     }

//     void printarray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }
