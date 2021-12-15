package avi.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

    public static void main(String[] args) {

        File file = new File("/home/prashik/IdeaProjects/Javabatchoct14/src/avi/fileHandling/FileWriting.txt");

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("My name is Avi");
            System.out.println("File write successful");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            int i = fileReader.read();
            while(i>0){
                System.out.print((char)i);
                i = fileReader.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
