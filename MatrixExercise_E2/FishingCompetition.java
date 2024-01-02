package MultidimentionalArrays_Matrix_L2.src;


import java.util.Arrays;
import java.util.Scanner;

public class FishingCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        int[] coordinates = fillMatrixAndGetCoordinates(matrix, scanner);


        printMatrix(matrix, n);

    }

    public static int[] fillMatrixAndGetCoordinates(char[][] matrix, Scanner scanner) {
        int[] coordinates = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;

            for (int col = 0; col < currentRow.length; col++) {
                char symbol = currentRow[col];
                if (symbol == 'S') {
                    coordinates[0] = row;
                    coordinates[1] = col;
                    break;

                }
                System.out.println();
            }
        }
        return coordinates;
    }

    private static void printMatrix(char[][] matrix, int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print(matrix[rows][cols]);

            }
            System.out.println();
        }
    }

    private static void move(String command, int[] position, char[][] fishingArea) {

        int row = position[0];
        int col = position[1];

        fishingArea[row][col] = '-';
        switch (command) {
            case "up":
                position[0]--;
                break;
            case "down":
                position[0]++;
                break;
            case "left":
                position[1]--;
                break;
            case "right":
                position[1]++;
                break;
        }
    }
}
