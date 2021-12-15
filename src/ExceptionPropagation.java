import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();

        obj.c();
        System.out.println("Hii");
    }

    public void a() throws FileNotFoundException {
        int i = 10;
        //int j = i / 0;
        FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
    }

    public void b() throws FileNotFoundException {
        a();
    }

    public void c() {

        try {
            b();
        } catch (FileNotFoundException f) {
            System.out.println(f);
        }
    }
}
