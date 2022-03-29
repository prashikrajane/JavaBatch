public class SortedArray {


    public static void main(String[] args) {
        int [] arr = new  int [] {5,4,6,3,1};

        System.out.println("The Original array is - ");
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int a;
        for (int i = 0; i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    a=arr[i];
                    arr[j]=arr[i];
                    arr[j]=a;
                }

            }

        }
        System.out.println("The sorted array is - ");
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
