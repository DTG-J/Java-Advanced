package MatrixExercise_E2;

import java.util.Scanner;

public class DemoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] token = scanner.nextLine().split(" ");
        int row = Integer.parseInt(token [0]);
        int col = Integer.parseInt(token[1]);


int [][] matrix = new int[row][col];


        fillTheMatrixVerticaly(matrix, row, col);
        printTheMatrix(matrix);
        System.out.println();
        fillTheMatrixHorisontaly(matrix, row, col);
        printTheMatrix(matrix);




    }

    private static void fillTheMatrixHorisontaly(int[][] matrix, int row, int col) {

        int count = 1;
        for (row = 0; row < matrix.length ; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = count++;

            }

        }
    }

    private static void printTheMatrix(int[][] matrix) {
        int row;
        int col;
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }
    }

    private static void fillTheMatrixVerticaly(int[][] matrix, int row, int col) {
        //Алгоритъм за вертикално пълнене на матрица
        int count = 1;
        for (col = 0; col < matrix[row - 1].length; col++) {
            for (row = 0; row < matrix.length; row++) {
                matrix [row][col] = count++;

            }

        }
    }





}
