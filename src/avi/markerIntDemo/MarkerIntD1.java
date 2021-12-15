package avi.markerIntDemo;

public class MarkerIntD1 implements MarkerIntD{
    void show(){
        System.out.println("Hello World");
    }
}

class Demo{
    public static void main(String[] args) {
        MarkerIntD1 obj = new MarkerIntD1();
        if(obj instanceof MarkerIntD){
            obj.show();
        }else{
            System.out.println("NO");
        }
    }
}
