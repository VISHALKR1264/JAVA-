public class Inversecount {

    // Method to perform merge sort and count inversions
    public static int mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSortUtil(arr, temp, 0, arr.length - 1);
    }

    // Helper method for merge sort
    private static int mergeSortUtil(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            invCount += mergeSortUtil(arr, temp, left, mid);
            invCount += mergeSortUtil(arr, temp, mid + 1, right);
            invCount += merge(arr, temp, left, mid + 1, right);
        }
        return invCount;
    }

    // Method to merge two halves and count inversions
    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid, k = left;
        int invCount = 0;

        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 20, 6, 4, 5 };
        int n = arr.length;
        int result = mergeSort(arr);
        System.out.println("Number of inversions are " + result);
    }
}
