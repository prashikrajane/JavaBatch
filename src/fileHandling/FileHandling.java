package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("/home/prashik/IdeaProjects/Javabatchoct14/src/fileHandling/Test.txt");
      //  File file1 = new File("/home/prashik/IdeaProjects/Javabatchoct14/src/fileHandling/Test1.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "WELCOME";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);

            System.out.println("File write successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while(i>0){
                System.out.print((char)i);
                i = fileInputStream.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



