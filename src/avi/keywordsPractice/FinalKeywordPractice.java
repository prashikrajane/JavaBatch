                          // "final" keyword
/*
* "final" keyword is used to put restriction on class, method, variables.
 */

package avi.keywordsPractice;

public class FinalKeywordPractice {
//    public static void main(String[] args) {
//        final int A = 10;           // when final keyword is used apply upper case letter to name.
//        System.out.println(A);
//
//      //  int A = 20;                // Not possible
//        System.out.println(A);
//    }
//---------------------------------------------------------------------------------------------------------------
    public void atmNo(){
        System.out.println(546464654);
    }
    final void atmPin(){
        System.out.println(5344);
    }

}
class A extends FinalKeywordPractice{
    @Override
    public void atmNo(){
        System.out.println(464646546);
    }
//    @Override
//    public void atmPin(){                // This is not possible.
//        System.out.println(6546);
//    }

    public static void main(String[] args) {
        A a = new A();
        a.atmNo();
        a.atmPin();
    }
}
