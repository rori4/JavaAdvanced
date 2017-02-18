package L04_MultidimensionalArraysExercises;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);

        String[][] matrix = new String[r][c];

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                String firstLetter = Character.toString((char) (row + 97));
                String middleLetter = Character.toString((char) (col + row + 97));
                matrix[row][col] = firstLetter + middleLetter + firstLetter;
            }
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }


    }
}
