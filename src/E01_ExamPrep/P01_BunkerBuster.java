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

        commandExecute(impactRow,impact,damage);

        printResult();
    }

    private static void readMatrix(BufferedReader reader) {
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = reader.readLine().split(" ");
            for (int cols = 0; cols < matrix; cols++) {
                
            }
        }
    }
}
