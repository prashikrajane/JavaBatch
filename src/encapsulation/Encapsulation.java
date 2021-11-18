package encapsulation;

public class Encapsulation {
    private int id;
    private String name;
    private String address;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address = address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
class Demo{
    public static void main(String[] args){
        Encapsulation r = new Encapsulation();
        r.setId(1);
        r.setName("Prashik");
        r.setAddress("Mumbai");
        System.out.println(" Id==> " + r.getId());
        System.out.println(" name==> " + r.getName());
        System.out.println(" address==> " + r.getAddress());
    }
}
