package MultidimentionalArrays_Matrix_L2.src;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            int [] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix [row] = input;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ()
            sum += i;

        }

    }

}
