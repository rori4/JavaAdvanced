package MultidimensionalArraysExercises;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int[][] matrix = new int[row][col];
        int sum = 0;
        int bestRow = 0;
        int bestCol = 0;
        // Entering the matrix numbers
        for (int r = 0; r < row; r++) {
            String[] matrixRow = scanner.nextLine().split(" ");
            for (int c = 0; c < col; c++) {
                matrix[r][c] = Integer.parseInt(matrixRow[c]);
            }
        }
        // Checking each 3x3 matrix sum
        for (int r = 0; r < row - 2; r++) {
            for (int c = 0; c < col - 2; c++) {
                int checkSum = 0;
                for (int checkRow = r; checkRow < r + 3; checkRow++) {
                    for (int checkCol = c; checkCol < c + 3; checkCol++) {
                        checkSum += matrix[checkRow][checkCol];
                    }
                }
                if (checkSum > sum) {
                    sum = checkSum;
                    bestRow = r;
                    bestCol = c;
                }
            }
        }
        // Printing result
        System.out.printf("Sum = %s\n", sum);
        for (int i = bestRow; i < bestRow + 3; i++) {
            for (int j = bestCol; j < bestCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
