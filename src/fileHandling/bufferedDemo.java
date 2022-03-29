package fileHandling;

import java.io.*;

public class bufferedDemo {
    public static void main(String[] args) {

        File file = new File("/home/prashik/IdeaProjects/JavaBatch/src/fileHandling/bufferDemo.txt");


//        try {
//
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//
//            String str = "Hello";
//            byte [] arr = str.getBytes();
//            bufferedOutputStream.write(arr);
//
//            bufferedOutputStream.close();
//            fileOutputStream.close();
//            System.out.println("File Create Successfully");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }




        try {
            FileInputStream fileInputStream = new FileInputStream("/home/prashik/IdeaProjects/JavaBatch/src/fileHandling/S1.txt");
            FileInputStream fileInputStream1 =new FileInputStream("/home/prashik/IdeaProjects/JavaBatch/src/fileHandling/S2.txt");
//            BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInputStream);

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,fileInputStream);


//            int i = bufferedInputStream.read();
            int i = sequenceInputStream.read();

            while(i>0){
                System.out.print((char)i);
                i=sequenceInputStream.read();

            }
            sequenceInputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
