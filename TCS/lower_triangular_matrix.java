public class lower_triangular_matrix {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 8, 7, 6 },
                { 5, 4, 3, 2 }
        };


        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(j>i)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    
    }

}
