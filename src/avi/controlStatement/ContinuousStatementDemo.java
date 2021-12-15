package avi.controlStatement;

public class ContinuousStatementDemo {
    public void show(){
        int i;
        for(i = 1; i<=10; i++){
            if(i==5)
                continue;
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        ContinuousStatementDemo obj = new ContinuousStatementDemo();
        obj.show();
    }
}
