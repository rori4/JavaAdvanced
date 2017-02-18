package E01_ExamPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01_BunkerBuster {
    private static int[][] matrix;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = reader.readLine().split(" ");
        Integer rows = Integer.parseInt(sizes[0]);
        Integer cols = Integer.parseInt(sizes[1]);
        matrix = new int[rows][cols];

        readMatrix(reader);
        String command = reader.readLine();
        while (!"cease fire!".equals(command)) {
            String[] tokens = command.split(" ");
            Integer impactRow = Integer.parseInt(tokens[0]);
            Integer impactCol = Integer.parseInt(tokens[1]);
            String power = tokens[2];
            commandExecute(impactRow, impactCol, power);
            command = reader.readLine();
        }
        int cellDestroyed = findResult();
        System.out.println("Destroyed bunkers: " + cellDestroyed);
        Double percent = 100.0 * cellDestroyed / (rows * cols);
        System.out.println("Damage done: " + String.format("%.1f %%", percent));
    }

    private static int findResult() {
        int counter = 0;
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                if (anAMatrix <= 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void commandExecute(Integer impactRow, Integer impactCol, String power) {
        Integer damage = (int) power.charAt(0);
        cellDamage(impactRow, impactCol, damage);
        if (damage%2 !=0){
            damage=damage/2 +1;
        } else {
            damage/=2;
        }
        cellDamage(impactRow, impactCol+1, damage);
        cellDamage(impactRow+1, impactCol+1, damage);
        cellDamage(impactRow+1, impactCol, damage);
        cellDamage(impactRow+1, impactCol-1, damage);
        cellDamage(impactRow, impactCol-1, damage);
        cellDamage(impactRow-1, impactCol-1, damage);
        cellDamage(impactRow-1, impactCol, damage);
        cellDamage(impactRow-1, impactCol+1, damage);
    }

    private static void cellDamage(Integer impactRow, Integer impactCol, Integer damage) {
        try {
            matrix[impactRow][impactCol] -= damage;
        } catch (IndexOutOfBoundsException ignore) {}
    }

    private static void readMatrix(BufferedReader reader) throws IOException {
        //This way we ensure that the jagged array won't fuck us up!
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = reader.readLine().split(" ");
            for (int col = 0; col < reminder.length; col++) {
                matrix[row][col] = Integer.parseInt(reminder[col]);
            }
        }
    }
}
