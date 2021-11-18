                                        // Encapsulation
/*
It is a mechanism thorough which we can wrapping the data members and members method of class in a single unit.
 */
package avi;

public class Homework15 {
    private int id;
    private String name;
    private String address;

    public int getId(){ return id = id; }
    public void setId(int id){ this.id = id;}

    public String getName(){return name=name;}
    public void setName(String name){this.name=name;}

    public String getAddress(){return address=address;}
    public void setAddress(String address){this.address=address;}
}
class Result{
    public static void main(String[] args) {
        Homework15 r = new Homework15();
        r.setId(12);
        r.setName("Prashik");
        r.setAddress("Pune");

        System.out.println("Id==> " + r.getId());
        System.out.println("Name==> " + r.getName());
        System.out.println("Address==> " + r.getAddress());
    }
}