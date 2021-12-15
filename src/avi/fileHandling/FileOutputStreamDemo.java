package avi.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {

        File file = new File("/home/prashik/IdeaProjects/Javabatchoct14/src/avi/fileHandling/FileOutputS.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);   // FileOutputStream is use for write.
            String str = "My name is Prashik";                // In this string can not be stored, so need string arr.
            byte [] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File write successful");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);      // FileInputStream is use for read.
            int i = fileInputStream.read();
            while(i>0){
                System.out.print(((char)i));
                i = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
