package L09_FilesAndStreamsLab;

import java.io.File;

public class P07_ListFiles {
    public static void main(String[] args) {
        String inputPath = "D:\\Files-and-Streams\\";

        File file = new File(inputPath);

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (!f.isDirectory()) {
                    System.out.printf("%s: %s%n",f.getName(),f.length());
                }
            }
        }
    }
}
