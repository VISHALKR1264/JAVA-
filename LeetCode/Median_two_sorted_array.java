// import java.util.Arrays;

// class Median_two_sorted_array {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n1 = nums1.length;
//         int n2 = nums2.length;
//         int[] nums3 = new int[n1 + n2];
//         int n3 = nums3.length;
//         int i = 0, j = 0, k = 0;

//         while (i < n1 && j < n2) {
//             if (nums1[i] < nums2[j]) {
//                 nums3[k++] = nums1[i++];
//             } else {
//                 nums3[k++] = nums2[j++];
//             }
//         }

//         while (i < n1) {
//             nums3[k++] = nums1[i++];
//         }

//         while (j < n2) {
//             nums3[k++] = nums2[j++];
//         }

//         Arrays.sort(nums3);

//         float mid;
//         if (n3 % 2 == 0) {
//             float mid1 = nums3[n3 / 2 - 1];
//             float mid2 = nums3[n3 / 2];
//             mid = (mid1 + mid2) / 2;
//         } else {
//             mid = nums3[n3 / 2];
//         }

//         return (double) mid;
//     }
//     public static void main(String[] args) {
//         Median_two_sorted_array mm=new Median_two_sorted_array();
//         int[] nums1={1,2};
//         int[] nums2={3,4};
//         double median=mm.findMedianSortedArrays(nums1, nums2);
//         System.out.println("Median is --"+median);
//     }
// }

///////////////////////////////////////////---------------------------->

/**
 * Median_two_sorted_array u
 * Merge by System.arraycopy
 * Sort by Merge_Sort
 */
public class Median_two_sorted_array {
    int tempmerge[];
    int array[];
    int length;

    public void sortt(int mergedarray[]) {
        this.array = mergedarray;
        this.length = mergedarray.length;
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

    public static void main(String[] args) {
        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2 };
        int[] mergedarray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedarray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedarray, arr1.length, arr2.length);
        for (int k : mergedarray)
            System.out.println(k);
        // For shorting going to use merge sort

        Median_two_sorted_array mm = new Median_two_sorted_array();
        mm.sortt(mergedarray);
        float mid;
        int n3 = mergedarray.length;
        if (n3 % 2 == 0) {
            float mid1 = mergedarray[n3 / 2 - 1];
            float mid2 = mergedarray[n3 / 2];
            mid = (mid1 + mid2) / 2;
        } else {
            mid = mergedarray[n3 / 2];
        }

        System.out.println("Median--" + mid);
    }
}

// ///////////////////////////////---------------------->
// //With ArrayList-->
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class Median_two_sorted_array {
// public double findMedianSortedArrays(int[] nums1, int[] nums2) {
// List<Integer> mergedList = new ArrayList<>();
// int n1 = nums1.length;
// int n2 = nums2.length;
// int i = 0, j = 0;

// // Merge the arrays into ArrayList
// while (i < n1 && j < n2) {
// if (nums1[i] < nums2[j]) {
// mergedList.add(nums1[i++]);
// } else {
// mergedList.add(nums2[j++]);
// }
// }

// // Add remaining elements from both arrays
// while (i < n1) {
// mergedList.add(nums1[i++]);
// }

// while (j < n2) {
// mergedList.add(nums2[j++]);
// }

// // Sort the ArrayList
// Collections.sort(mergedList);

// int n3 = mergedList.size();
// double mid;

// if (n3 % 2 == 0) {
// int mid1 = mergedList.get(n3 / 2 - 1);
// int mid2 = mergedList.get(n3 / 2);
// mid = (mid1 + mid2) / 2.0;
// } else {
// mid = mergedList.get(n3 / 2);
// }

// return mid;
// }
// public static void main(String[] args) {
// Median_two_sorted_array mm=new Median_two_sorted_array();
// int[] nums1={1,2};
// int[] nums2={3,4};
// double median=mm.findMedianSortedArrays(nums1, nums2);
// System.out.println("Median is --"+median);
// }
// }
