package avi.serializationDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationD {
    public static void main(String[] args) {
        SerializationD1 obj = new SerializationD1();
        obj.name = "Prashik";
        obj.address = "Akot";


        File file = new File("/home/prashik/IdeaProjects/Javabatchoct14/src/avi/serializationDemo/Serialization.txt");
        try {
            FileOutputStream fileOutputStream =new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("File create successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
