package avi.controlStatement;

public class ForEachLoopDemo {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60};

        for(int b:arr){
            System.out.println(b);
        }
        for(int i = 0; i < arr.length;i++ ){
            System.out.println(arr[i]);
        }
    }
}
