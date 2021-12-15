package avi.fileHandling;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {

        File file = new File("/home/prashik/IdeaProjects/Javabatchoct14/src/avi/fileHandling/BufferedW.txt");

        try {
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Buffered Writer Example");
            System.out.println("File write successfully");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while(i>0){
                System.out.print((char)i);
                i = bufferedReader.read();

            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
