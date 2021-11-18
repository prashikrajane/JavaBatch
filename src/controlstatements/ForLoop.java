package controlstatements;

public class ForLoop {
    public static void main(String[] args){
        int[] arr=new int[6];
        arr[0] = 10;
        arr[1] = 60;
        arr[2] = 30;
        arr[3] = 90;
        arr[4] = 70;
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
//        for(i=6;i>=0;i--){
//            System.out.println(arr[i]);
//        }
    }
}
