package MultidimentionalArrays_Matrix_L2.src;

import java.util.Arrays;
import java.util.Scanner;

public class ReadAndFillMatrixFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 4;
        int cols = 7;

        int [] [] matrix = new int[rows][cols];

        //Matrix read  and fill from console with Stream API
        for (int i = 0; i < rows; i++) {
            int [] rowInput = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix [i] = rowInput;
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix [row][col] + " ");
                }
            System.out.println();
        }

    }
}
