package inheritance;

public class HistoryTeacher extends Teacher {
    public static void main(String[] args) {

        HistoryTeacher obj = new HistoryTeacher();

        obj.id = 6;
        obj.name = "Rahul";
        obj.address = " Mumbai";

        System.out.println("id==>" + obj.id + "name==>" + obj.name + "address==>" + obj.address);
    }
}
