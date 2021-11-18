package operators;

public class OperatorsDemo {
    void Show()
    {
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
    }
    void Show(int a ,int b){
        System.out.println(a>b);
    }
    void Add(){
        int a = 55; int b = 65; int c;
        c = ++a - ++b;
        System.out.println(c);
    }
}
class Demo{
    public static void main(String[] args){
        OperatorsDemo r = new OperatorsDemo();
        r.Show();
        r.Show(65 , 65);
        r.Add();
    }
}
