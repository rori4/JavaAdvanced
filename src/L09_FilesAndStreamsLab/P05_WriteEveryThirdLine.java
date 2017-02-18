package L09_FilesAndStreamsLab;

import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "D:\\Files-and-Streams\\input.txt";
        String outputPath = "D:\\Files-and-Streams\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        PrintWriter writer = new PrintWriter(outputPath)) {
            String line = reader.readLine();
            int counter = 1;
            while (line!=null){
                if (counter%3==0){
                    writer.println(line);
                }

                line = reader.readLine();
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
