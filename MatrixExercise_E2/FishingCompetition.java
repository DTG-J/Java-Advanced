package MultidimentionalArrays_Matrix_L2.src;


import java.util.Arrays;
import java.util.Scanner;

public class FishingCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        int[] coordinates = fillMatrixAndGetCoordinates(matrix, scanner);

        String input = scanner.nextLine();

        while (!input.equals("collect the nets")){





            input = scanner.nextLine();
        }
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
    private static void handleBoundaries(int[] position, int size) {
        for (int i = 0; i < 2; i++) {
            if (position[i] < 0) position[i] = size - 1;
            else if (position[i] >= size) position[i] = 0;
        }
    }
    private static void handleWhirlpool(int[] position) {
        System.out.println("You fell into a whirlpool! The ship sank and you lost the fish you caught. " +
                "Last coordinates of the ship: [" + position[0] + "," + position[1] + "]");
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
