package MultidimentionalArrays_Matrix_L2.src;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixConsoleFillByColumns {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int rows = 5;
                int cols = 8;
                int[][] matrix = new int[rows][cols];

                // Read the matrix values from the console
                for (int row = 0; row < rows; row++) {
                    int[] rowInput = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

                    // Check if the number of input elements matches the number of columns
                    if (rowInput.length != cols) {
                        System.out.println("Invalid input. Please enter " + cols + " values for each row.");
                        return; // Exit the program if the input is invalid
                    }

                    matrix[row] = rowInput;
                }

                // Print the filled matrix
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
            }
        }

