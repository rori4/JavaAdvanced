package MultidimensionalArraysExercises;

import java.util.Objects;
import java.util.Scanner;

public class $MatrixShufflingINCOMPLETE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimm = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dimm[0]);
        int cols = Integer.parseInt(dimm[1]);
        String[][] matrix = new String[rows][cols];

        ReadInput(scanner, rows, cols, matrix);

        String[] commands = scanner.nextLine().split(" ");
        while (!Objects.equals(commands[0], "END")){
                SwapInputAndPrint(matrix,commands);
                commands = scanner.nextLine().split(" ");
        }

    }

    private static void SwapInputAndPrint(String[][] matrix, String[] commands) {
        if (commands[0].equals("swap")){
            String command = commands[0];
            int row1 = Integer.parseInt(commands[1]);
            int col1 = Integer.parseInt(commands[2]);
            int row2 = Integer.parseInt(commands[3]);
            int col2 = Integer.parseInt(commands[4]);
            if (ValidateSwap(command,matrix,row1,row2,col1,col2)){
                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;
                for (String[] ints : matrix) {
                    for (String anInt : ints) {
                        System.out.printf("%s ", anInt);
                    }
                    System.out.println();
                }
            } else {
                System.out.printf("Invalid input!\n");
            }
        } else {
            System.out.printf("Invalid input!\n");
        }
    }

    private static boolean ValidateSwap(String command, String[][] matrix, int row1, int row2, int col1, int col2) {
        if (!Objects.equals(command, "swap")){
            return false;
        } else if (row1<0 || row1>=matrix.length){
            return false;
        } else if (row2<0 || row1>=matrix.length){
            return false;
        } else if (col1<0 || col1>=matrix[row1].length){
            return false;
        } else if (col2<0 || col2>=matrix[row2].length){
            return false;
        } return true;
    }

    private static void ReadInput(Scanner scanner, int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=input[col];
            }
        }
    }
}