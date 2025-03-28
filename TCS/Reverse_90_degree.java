public class Reverse_90_degree {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            
            // Transpose the matrix
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            
            // Reverse each row
            for (int i = 0; i < n; i++) {
                reverse(matrix[i]);
            }
        }
        
        private void reverse(int[] row) {
            int start = 0, end = row.length - 1;
            while (start < end) {
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;
                start++;
                end--;
            }
        }
    
        public static void main(String[] args) {
            Reverse_90_degree solution = new Reverse_90_degree();
    
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            System.out.println("Original Matrix:");
            printMatrix(matrix);
    
            solution.rotate(matrix);
    
            System.out.println("Matrix after 90-degree rotation:");
            printMatrix(matrix);
        }
        
        // Helper method to print the matrix
        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
        
}
