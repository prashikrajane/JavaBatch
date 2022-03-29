package fileHandling;

import java.io.*;

public class bufferedWriterDemo {

    public static void main(String[] args) {

        File file = new File("/home/prashik/IdeaProjects/JavaBatch/src/fileHandling/sampleWriter.txt");

        try {
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(" Hello Codekul");

            bufferedWriter.close();
            fileWriter.close();
            System.out.println("File write successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i =bufferedReader.read();

            while(i>0){
                System.out.print((char)i);
                i=bufferedReader.read();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
