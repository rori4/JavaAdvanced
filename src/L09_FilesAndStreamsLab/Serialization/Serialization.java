package L09_FilesAndStreamsLab.Serialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        final String objectPath = "D:\\object.ser";
        Cube cube = new Cube();
        cube.color = "green";
        cube.depth = 13;
        cube.width = 14;
        cube.height = 5;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(objectPath))){
            oos.writeObject(cube);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(objectPath))) {
            Cube loadedCube = (Cube) ois.readObject();
            System.out.println(loadedCube.color);
            System.out.println(loadedCube.depth);
            System.out.println(loadedCube.width);
            System.out.println(loadedCube.height);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
