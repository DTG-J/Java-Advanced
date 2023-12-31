package MultidimentionalArrays_Matrix_L2.src;


import java.util.Arrays;
import java.util.Scanner;

public class FishingCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char [][] matrix = new char [n][n];

       int[]coordinates = fillMatrixAndGetCoordinates(matrix,scanner);








        printMatrix(matrix, n);

    }
    public static int[] fillMatrixAndGetCoordinates(char[][]matrix, Scanner scanner){
        int[]coordinates = new int[2];
        for (int row = 0; row < matrix.length ; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;

            for (int col = 0; col < currentRow.length; col++) {
                char symbol = currentRow[col];
                if(symbol == 'S'){
                    coordinates[0] = row;
                    coordinates[1] = col;
                    break;

                }
                System.out.println();
            }
        }
        return coordinates;
    }

    private static void printMatrix(char [][] matrix, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }
    }
}
