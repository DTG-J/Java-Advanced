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
    //input shows that if we receive more columns from the console than we expext in the code -> in printing we
    //receive the number of expected columns filled with numbers !!!!
    //input from the console
    //18 19 20 21 22 23 24 25
    //26 27 28 29 30 31 32 33
    //34 35 36 37 38 39 40 41
    //42 43 44 45 46 47 48 49
    //Printed result:
    //18 19 20 21 22 23 24
    //26 27 28 29 30 31 32
    //34 35 36 37 38 39 40
    //42 43 44 45 46 47 48
}
