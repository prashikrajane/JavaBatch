package avi.fileHandling;

import java.io.*;

public class TryWithResourcesD {
    public static void main(String[] args) {

        File file = new File("/home/prashik/IdeaProjects/Javabatchoct14/src/avi/fileHandling/TryWithResources");


        try (FileWriter fileWriter = new FileWriter(file);
        ){

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Buffered Writer Example of Try with Resources");
            System.out.println("File write successfully");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(file)){

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while (i>0) {
                System.out.print((char)i);
                i = bufferedReader.read();
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
