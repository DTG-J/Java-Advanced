package MultidimentionalArrays_Matrix_L2.src;

import java.util.Scanner;

public class MatrixFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] tokens = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(tokens [0]);
        int cols = Integer.parseInt(tokens[1]);

        int [][] matrix = new int [rows][cols];

        //MatrixFill
        int count = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix  [row][col] = count;
                count ++;
            }
        }

        //PrintTheMatrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix [row][col] + " ");
            }
            System.out.println();

        }

    }
}
