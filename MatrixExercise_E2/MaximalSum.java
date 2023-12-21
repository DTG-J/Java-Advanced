package MultidimentionalArrays_Matrix_L2.src;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String [] input = scanner.nextLine().split(" ");
    int rows = Integer.parseInt(input [0]);
    int cols = Integer.parseInt(input[1]);

    int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int [] rowOfElements = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix [i]= rowOfElements;

        }
        System.out.println();


    }
}
