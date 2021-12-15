package fileHandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("/home/prashik/IdeaProjects/Javabatchoct14/src/fileHandling/bufferWriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Have a good day");
            System.out.println("File write successfully");
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader
                    = new FileReader("/home/prashik/IdeaProjects/Javabatchoct14/src/fileHandling/bufferWriter.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = bufferedReader.read();


            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
