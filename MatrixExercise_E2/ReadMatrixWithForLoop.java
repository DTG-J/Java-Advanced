package MultidimentionalArrays_Matrix_L2.src;

import java.util.Scanner;

public class ReadMatrixWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 5;
        int cols = 7;
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowFromConsole = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowFromConsole[col]);
            }
        }
             for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();

        }
    }
}
