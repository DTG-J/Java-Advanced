package MultidimentionalArrays_Matrix_L2.src;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixFillByColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] tokens = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = tokens[0];
        int cols = tokens[1];
        int [][] matrix = new int[rows][cols];


        int count = 1;

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                matrix [row][col] = count;
                count ++;
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix [row][col] + " ");

            }
            System.out.println();

        }
    }
}
