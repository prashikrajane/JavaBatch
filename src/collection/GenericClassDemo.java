package collection;

public class GenericClassDemo<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        GenericClassDemo<Integer> g = new GenericClassDemo();
        g.setT(54);
        System.out.println(g.getT());

        GenericClassDemo<String> g1 = new GenericClassDemo<>();
        g1.setT("Avi");
        System.out.println(g1.getT());
    }
}
