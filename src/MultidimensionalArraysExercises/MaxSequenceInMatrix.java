package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSequenceInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        String[][] matrix = new String[row][col];
        ArrayList<String> longest = new ArrayList<>();

        // Entering the matrix
        for (int r = 0; r < row; r++) {
            String[] matrixRow = scanner.nextLine().split(" ");
            for (int c = 0; c < col; c++) {
                matrix[r][c] = matrixRow[c];
            }
        }
        int maxCount=0;

        for (int c = 0; c < col; c++) {
            int countRows=1;
            for (int r = 0; r < row; r++) {

                if (matrix[row][col]==matrix[row+1][col]){
                    countRows++;
                }
            }
            if (maxCount<countRows){
                maxCount=countRows;
            }
        }

        for (int r = 0; r < row; r++) {
            int countCols=1;
            for (int c = 0; c < col; c++) {

                if (matrix[row][col]==matrix[row][col+1]){
                    countCols++;
                }
            }
            if (maxCount<countCols){
                maxCount=countCols;
            }
        }



    }
}
