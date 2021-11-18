package inheritance;


public class Teacher{                  // Parent Class, base class, supper class.

    int id;
    String name;
    String address;

}

class MathsTeacher extends Teacher{               // 1) Child class, sub-class, derived class.

    public static void main(String[] args){

        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name = "Prashik";
        obj.address = "Mumbai";

        System.out.println(" id==> " + obj.id  + " name==> " + obj.name + " address==> " + obj.address);
    }
}

class ChemistryTeacher extends Teacher{                  // 2) Child class


    public static void main(String[] args){
        ChemistryTeacher obj = new ChemistryTeacher();

        obj.id = 4;
        obj.name = "Avi";
        obj.address = "Akola";

        System.out.println(" id==> " + obj.id + " name==> " + obj.name + " address==> " + obj.address);
    }
}
class PhysiscTeacher extends ChemistryTeacher{              // 3) Child class

    public static void main(String[] args){

        PhysiscTeacher obj = new PhysiscTeacher();

        obj.id = 5;
        obj.name = "Rakesh";
        obj.address = "Nagpur";

        System.out.println(" id==> " + obj.id + " name==> " + obj.name + " address==> " + obj.address);

    }
}
