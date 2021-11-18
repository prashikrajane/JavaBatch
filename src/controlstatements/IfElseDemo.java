package controlstatements;

public class IfElseDemo {
    public static void main(String[] args) {
        int age = 17;
        String nationality = "Indian";

        if (age <= 18) {
            if(nationality.equals("Indian")){
            System.out.println("You can vote");
            }else{
                System.out.println("Not Indian");
            }
        } else{
            System.out.println("You can not vote");
        }


        int a=100,b=200,c=300,d=400,e=500;
        if(a>b && a>c && a>d && a>e){
            System.out.println("a is greater");
        }else if(b>c && b>d && b>e){
            System.out.println("b is greater");
        }else if(c>d && c>e){
            System.out.println("c is greater");
        }else if(d>e){
            System.out.println("d is greater");
        }else{
            System.out.println("e is greater");
        }

        int j = 0;
//        if (j>0){
//            System.out.println("Not zero");
//        }else{
//            System.out.println("Zero");
//        }

        String str=(j<0)?"Not Zero":"Zero";
        System.out.println(str);
    }
}
