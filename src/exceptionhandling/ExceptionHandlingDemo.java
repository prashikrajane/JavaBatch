// Arithmetic exception and Null pointer Exception
package exceptionhandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("Hii");
        int i = 10;
        // int j = i/0;                               // Exception is program stop when it is not  able to execute
        try {
            int j = i / 0;

//            try{
//                String str = null;
//                System.out.println(str.length());      // Null pointer exception
//            }catch(Exception e){
//                e.printStackTrace();
//            }

        } catch (NullPointerException nullPointerException) {
            System.out.println("NullPointer==>" + nullPointerException.getMessage());
        }
//        catch(ArithmeticException arithmeticException){
//            System.out.println("ArithmeticException==> " + arithmeticException.getMessage());
//        }
        catch (Exception e) {
            System.out.println("Exception==>" + e.getMessage());
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println(i);
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
    }
}
