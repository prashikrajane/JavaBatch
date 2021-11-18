package abstraction.abstractiondemo;

public class Cricket extends AbcSport {    //abstract class extends

    @Override
    public void play(){                 // declaration method completed
        System.out.println("Cricket having 11 players in one team");

    }
    @Override
    public void exercise(){           // u can change the method or leave as it is.
        System.out.println("Exercise good for health");

    }

}
class Team extends Cricket{
    public void play() {
        System.out.println("Always two team play in match ");
    }
    public static void main(String[] args){
        Cricket r=new Cricket();
        Team r2=new Team();
        r2.play(); r.play();
        r.exercise();
    }
}
