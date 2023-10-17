package MatrixExercise_E2;

import java.util.Scanner;

public class MatrixoOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] rowsAndColumns = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rowsAndColumns [0]);
        int cols = Integer.parseInt(rowsAndColumns [1]);


      String [][] palindromeMatrix = new String[rows][cols];
      fillTheMatrix(palindromeMatrix);
      printMatrix(palindromeMatrix);



    }
    private static void printMatrix (String [][] palindromeMatrix){
        for (int rows = 0; rows < palindromeMatrix.length; rows++) {
            for (int cols = 0; cols < palindromeMatrix [rows].length; cols++) {
                System.out.print(palindromeMatrix [rows][cols] + " ");
                }
            System.out.println();
        }
    }
    private static void fillTheMatrix (String [][] palindromeMatrix){
        for (int rows = 0; rows < palindromeMatrix.length; rows++) {
            for (int cols = 0; cols < palindromeMatrix [rows].length ; cols++) {
                    char outsideLetter = (char) ('a' + rows);
                char middleLetter = (char) ('a'+ rows + cols);
                palindromeMatrix [rows][cols] = "" + outsideLetter + middleLetter + outsideLetter;


            }

        }
    }
}
