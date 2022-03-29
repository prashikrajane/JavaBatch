package fileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class SequenceFileWriter {


     public static void main(String[] args) {
          FileOutputStream fileWriter;   FileOutputStream fileWriter1;

          {
               try {
                    fileWriter= new FileOutputStream("/home/prashik/IdeaProjects/JavaBatch/src/fileHandling/S1.txt");

                    fileWriter1 = new FileOutputStream("/home/prashik/IdeaProjects/JavaBatch/src/fileHandling/S2.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    String str = "Welcome to file handling";
                    byte[] arr = str.getBytes();
                    byteArrayOutputStream.write(arr);
                    byteArrayOutputStream.writeTo(fileWriter);
                    byteArrayOutputStream.writeTo(fileWriter1);
               } catch (IOException e) {
                    e.printStackTrace();
               }
          }
     }

}
