package MultidimensionalArraysExercises;

import java.util.Scanner;


public class CollectCoins {

    static int curRow = 0;
    static int curCol = 0;
    static int coins = 0;
    static int walls = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] field = new String[4][];
        for (int i = 0; i < 4; i++) {
            field[i] = scanner.nextLine().split("");
        }
        String[] moves = scanner.nextLine().split("");
        MakeMoves(moves, field);
        PrintResults();
    }

    private static void MakeMoves(String[] moves, String[][] field) {
        CollectCoin(field);
        for (String move : moves) {
            switch (move) {
                case ">":
                    PerformMove(field, curRow, curCol + 1);
                    break;
                case "<":
                    PerformMove(field, curRow, curCol - 1);
                    break;
                case "^":
                    PerformMove(field, curRow - 1, curCol);
                    break;
                case "V":
                    PerformMove(field, curRow + 1, curCol);
                    break;
            }
        }
    }

    private static void PerformMove(String[][] field, int row, int col) {
        if (ValidMove(field, row, col)) {
            curRow = row;
            curCol = col;
            CollectCoin(field);
        } else {
            walls++;
        }
    }


    private static boolean ValidMove(String[][] field, int row, int col) {
        if (row >= 0 && row < field.length) {
            if (col >= 0 && col < field[row].length) {
                return true;
            }
        }
        return false;
    }

    private static void CollectCoin(String[][] field) {
        if (field[curRow][curCol].equals("$")) {
            coins++;
        }
    }

    private static void PrintResults() {
        System.out.printf("Coins = %d", coins);
        System.out.println("");
        System.out.printf("Walls = %d", walls);
    }
}
