package MultidimentionalArrays_Matrix_L2.src;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[matrixSize][matrixSize];
        MatrixConsoleRead(matrixSize, scanner, matrix);

        int mainDiagSum = 0;
        for (int counter = 0; counter < matrix.length; counter++) {
            mainDiagSum += matrix [counter][counter];
        }
        /*for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                if (row == col){
                    mainDiagSum += matrix [row][col];
                }
            }
        }*/
        int secondDiagSum = 0;
       /* for (int row = matrixSize - 1, col = 0; col< matrixSize && row >=0 ; row--, col++) {
            secondDiagSum += matrix [row][col];
        }*/

        for (int row = 0; row < matrixSize; row++) {
            secondDiagSum +=  matrix [row][matrixSize-1-row];

        }
        int diagonalDiff = Math.abs(mainDiagSum - secondDiagSum);
        System.out.println(diagonalDiff);

    }

    private static void MatrixConsoleRead(int matrixSize, Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrixSize; row++) {
            int [] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[row] = input;
        }
    }
}
