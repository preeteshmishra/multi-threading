package filehandling;

import java.io.*;

public class FileReadWrite{

    public static void main(String args[]) {


            File file = new File("readwrite.txt");

            char[] in = new char[50];
        try {
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("Preetesh\nRocky\nAniket\nGautam");

            fileWriter.flush();
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fileReader);
            int size = bfr.read(in);
            System.out.println("Size " + size);

          /*  String s;
            System.out.println(bfr.readLine());*/

       //     while ((s = bfr.readLine()) != null){
            for(char c : in){
                System.out.print(c);
            }
                //System.out.println(s);

            bfr.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }



}
