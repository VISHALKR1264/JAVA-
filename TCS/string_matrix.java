//wap in java where user input a string we had to calculate its length ,suppose the length is 16 so make the perfect square of length 4 X 4 and make a matrix of that and add the string into the matrix and then print the matrix column wise;

import java.util.Scanner;

public class string_matrix {
     void printMatrix(char[][] matrix) {
        for (char[] col : matrix) {
            for (char elem : col) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the String as a Input");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        int sqrt = (int) Math.ceil(Math.sqrt(length));
        System.out.println("The square root value is "+sqrt);
        char matrix[][] = new char[sqrt][sqrt];
        int index = 0;
        for (int i = 0; i < sqrt; i++) {
            for (int j = 0; j < sqrt; j++) {
                if (index < length) {

                    matrix[i][j] = input.charAt(index++);
                } else {
                    matrix[i][j] = '-';
                }
            }
        }

        for (int i = 0; i < sqrt; i++) {
            for (int j = 0; j < sqrt; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printing Column wise");
        // for (int j = 0; j < sqrt; j++) {
        //     for (int i = 0; i < sqrt; i++) {

        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        string_matrix s=new string_matrix();
        s.printMatrix(matrix);
    }
}
