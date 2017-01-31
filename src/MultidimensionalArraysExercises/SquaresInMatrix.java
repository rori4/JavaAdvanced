package MultidimensionalArraysExercises;

import java.util.Scanner;

public class SquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int counter = 0;
        String[][] matrix = new String[row][col];

        for (int r = 0; r < row; r++) {
            String[] matrixLine = scanner.nextLine().split(" ");
            for (int c = 0; c < col; c++) {
                matrix[r][c] = matrixLine[c];
            }
        }

        for (int r = 0; r < row - 1; r++) {
            for (int c = 0; c < col - 1; c++) {
                if (matrix[r][c].equals(matrix[r + 1][c]) &&
                        matrix[r][c].equals(matrix[r][c + 1]) &&
                        matrix[r][c].equals(matrix[r + 1][c + 1])){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
