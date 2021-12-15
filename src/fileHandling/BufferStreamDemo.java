package fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferStreamDemo {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream
                    = new FileOutputStream("/home/prashik/IdeaProjects/Javabatchoct14/src/fileHandling/bufferfile.txt");

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "Welcome Prashik";
            byte [] arr = str.getBytes(StandardCharsets.UTF_8);
            bufferedOutputStream.write(arr);
            System.out.println("File write successfully");
            bufferedOutputStream.close();
            fileOutputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream
                    = new FileInputStream("/home/prashik/IdeaProjects/Javabatchoct14/src/fileHandling/bufferfile.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while(i>0){
                System.out.print((char)i);
                i = bufferedInputStream.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
