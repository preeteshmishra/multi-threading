package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {



    public static void main(String[] args) {

        boolean newFile = false;

        File file = new File("demoFile.txt");

        System.out.println(file.exists());
        try {
            newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.exists());
           // FileWriter


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
