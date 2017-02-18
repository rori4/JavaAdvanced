package L09_FilesAndStreamsLab;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) {
        String path = "D:\\input.txt";
        try ( FileInputStream fis = new FileInputStream(path)) {
            int oneByte = fis.read();
            while (oneByte>=0){
                System.out.print(Integer.toBinaryString(oneByte)+" ");
                oneByte =fis.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
