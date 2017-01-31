package JavaSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

public class $BlurFilterINCOMPLETE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long blurAmount = scanner.nextInt();
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        long[][] matrix = new long[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int targetRow = scanner.nextInt();
        int targetCol = scanner.nextInt();
        for (int i = Math.max(targetRow-1,0); i <= Math.min(targetRow+1,row-1); i++) {
            for (int j = Math.max(targetCol-1,0); j <= Math.min(targetCol+1,col-1); j++) {
                matrix[i][j] += blurAmount;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
