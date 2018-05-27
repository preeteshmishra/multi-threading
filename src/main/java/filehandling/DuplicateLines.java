package filehandling;


import java.io.*;
import java.util.HashSet;

//Java program to delete duplicate lines in text file
public class DuplicateLines {

    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));


            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            String s = br.readLine();

            HashSet<String> hs = new HashSet<String>();

            while (s != null) {

                if (hs.add(s)) {
                    pw.println(s);
                }

                s = br.readLine();
            }

            pw.flush();
            br.close();
            pw.close();

            System.out.println("File system completed successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}