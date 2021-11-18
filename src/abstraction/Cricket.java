package abstraction;

public class Cricket implements Sport{
    @Override
    public void Exercise(){
        System.out.println("Cricket is a sport");
    }

}
class Football extends Cricket{
   // @Override
    public void Play(){
        System.out.println("Football is a Sport");
    }

}
class Demo{
    public static void main(String[] args){
        Cricket r = new Cricket();
        r.Exercise();
        Football r2 = new Football();
        r2.Play();
    }
}
