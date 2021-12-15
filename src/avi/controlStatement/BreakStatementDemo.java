// Break is a keyword which is used to break the loop in the program.

package avi.controlStatement;

public class BreakStatementDemo {
    public void show(){
        int i;
        for(i=1;i<=10;i++){
            if(i==5)
                break;
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        BreakStatementDemo obj = new BreakStatementDemo();
        obj.show();
    }
}
