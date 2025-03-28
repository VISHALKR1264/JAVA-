public class matrix_traversal {
    public static void spiral_traversal(int arr[][], int r, int cols) {
        int left = 0, top = 0, right = cols - 1, bottom = r-1 ;
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.printf("%d ", arr[top][i]);
            }
            top++; // To go down i.e. 5;
            for (int i = top; i <= bottom; i++) {
                System.out.printf("%d ", arr[i][right]);
            }
            right--; // to come one back i.e. 19;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.printf("%d ", arr[bottom][i]);
                }
                bottom--;

            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.printf("%d ", arr[i][left]);
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        int rows = a.length;
        int cols = a[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.printf("%d  ", a[i][j]);
            }
        }

        System.out.println();
        spiral_traversal(a, rows, cols);
    }
}
