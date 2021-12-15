package avi.fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedStreamDemo {
    public static void main(String[] args) {
         File file = new File("/home/prashik/IdeaProjects/Javabatchoct14/src/avi/fileHandling/BufferedS.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "BufferedStream Example";
            byte [] arr = str.getBytes(StandardCharsets.UTF_8);
            bufferedOutputStream.write(arr);
            System.out.println("File write successfully");
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i>0){
                System.out.print((char)i);
                i = bufferedInputStream.read();
                System.out.println("File read successfully");

            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
