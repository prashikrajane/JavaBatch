public class ThrowAndThrows {
    public static void main(String[] args) throws MyException {
        int age = 17;

        if(age>=18){
            System.out.println("You can vote");
        }else{
           // throw new MyException("You can not vote");
            try{
                throw new MyException("You can not vote");

            }catch(Exception e){
                System.out.println("Exception -->" + e.getMessage());
            }
        }
        System.out.println("hii");
    }
}

class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
