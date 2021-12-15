package avi.exceptionHandling;

public class ExceptionHandlingPractice {
    public static void main(String[] args) {

        try {
//            int i = 23 / 0;
//
//            System.out.println(i);

            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e.getMessage());

        }
//        catch (NullPointerException n){
//            System.out.println("NullPointerException" + n.getMessage());
//
//        }
        catch (Exception a) {
            System.out.println("Exception" + a.getMessage());

        } finally {
            System.out.println("Finally block always executed");
        }
        System.out.println("Hii");
        System.out.println("I am");
        System.out.println("Prashik");

    }
}
