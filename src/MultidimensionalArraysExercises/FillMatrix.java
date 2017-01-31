package MultidimensionalArraysExercises;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[n][n];
        int i = 1;

        if (type.equals("A"))
            for (int col = 0; col < n; col++) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = i;
                    i++;
                }
            }

        if (type.equals("B"))
            for (int col = 0; col < n; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < n; row++) {
                        matrix[row][col] = i;
                        i++;
                    }
                } else {
                    for (int row = n-1; row >= 0; row--) {
                        matrix[row][col] = i;
                        i++;
                    }
                }
            }


        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
