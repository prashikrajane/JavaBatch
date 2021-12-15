package anonymousInnerClass;

interface MyInterface {
    void show();

    void add(int i, int j);

}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        MyInterface mi = new MyInterface() {
            @Override
            public void show() {
                System.out.println("Hello world");
            }

            @Override
            public void add(int i, int j) {
                System.out.println(i + j);
            }
        };
        mi.show();
        mi.add(54, 54);
    }
}
