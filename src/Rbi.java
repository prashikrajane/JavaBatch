public class Rbi{
    void show(){
        System.out.println("Having intrest rate of 8%.");
    }
}
class Sbi extends Rbi{
    @Override
    void show(){
        System.out.println("Having intrest rate of 7%.");
    }
}
class Hdfc extends Sbi{
    @Override
    void show(){
        System.out.println("Having intrest rate of 6%.");
    }
}
class Kotak extends Hdfc{
    @Override
    void show(){
        System.out.println("Having intrest rate of 9%.");
    }
}
class Result{
    public static void main(String[] args){
        Kotak r = new Kotak();
        r.show();
    }
}
