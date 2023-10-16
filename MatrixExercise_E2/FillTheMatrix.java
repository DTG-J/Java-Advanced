package MatrixExercise_E2;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] tokens = scanner.nextLine().split(", ");
        int matrixSize = Integer.parseInt(tokens[0]);
        String matrixType = tokens[1];

        int [][] matrix = new int[matrixSize][matrixSize];

        switch (matrixType){
            case "A":
                fillMatrixTypeA (matrix);
                break;
            case "B":
                filMatrixTypeB (matrix);
                break;
        }

        printTheMatrix (matrix);








    }

    private static void filMatrixTypeB(int[][] matrix) {
        int count = 1; 
        for (int cols = 0; cols < matrix.length; cols++) {
            
            if (cols % 2 == 0){
                
                for (int rows = 0; rows < matrix [cols].length ; rows++) {
                    matrix [rows][cols] = count;
                    count ++; 
                }
            }else {
                for (int rows = matrix [cols].length - 1; rows >= 0 ; rows--) {
                    matrix [rows][cols] = count;
                    count++;
                    
                }
            }
            
        }
    }

    private static void printTheMatrix(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix [rows].length; cols++) {
                System.out.print(matrix [rows][cols] + " ");

            }
            System.out.println();
        }
    }

    private static void fillMatrixTypeA(int[][] matrix) {
        int count = 1;

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix [rows].length; cols++) {
                matrix[cols][rows] = count;
                count++;
            }
        }
    }
}
