package fileHandling;

import java.io.File;
import java.io.IOException;

public class fileNew {

    public static void main(String[] args) throws IOException {


        try{
            File file = new File("/home/prashik/IdeaProjects/JavaBatch/src/fileHandling/test1.txt");
            boolean f = file.createNewFile();
            System.out.println(f);
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
