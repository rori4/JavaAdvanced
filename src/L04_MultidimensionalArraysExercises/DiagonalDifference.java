package L04_MultidimensionalArraysExercises;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int rowAndCol = 0; rowAndCol < n; rowAndCol++) {
            firstDiagonal += matrix[rowAndCol][rowAndCol];
        }

        int diagRow = 0;
        for (int col = n - 1; col >= 0; col--){
            secondDiagonal += matrix[diagRow][col];
            diagRow++;
        }

        System.out.println(Math.abs(firstDiagonal - secondDiagonal));
    }
}
