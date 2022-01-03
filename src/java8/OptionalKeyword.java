package java8;

import java.util.Locale;
import java.util.Optional;

public class OptionalKeyword {
    public static void main(String[] args) {

        Employee obj = new Employee(1, "Prashik", null);
//        System.out.println(obj.address);

//        if (obj.getAddress()==null){
//            System.out.println(obj.getAddress().toLowerCase(Locale.ROOT));
//        }else{
//            System.out.println("Address is null");
//        }

//        Optional<String > optional = Optional.empty();
//        System.out.println(optional);
//        System.out.println();


//        try{
//            Optional<String> optional1 = Optional.of(obj.getAddress());
//            System.out.println(optional1);
//        }catch(NullPointerException n){
//            System.out.println(n.getMessage());
//        }

//        Optional<String> optional2 = Optional.ofNullable(obj.getAddress());
//        System.out.println(optional2.orElse("Address is null"));

        Optional<String> optional3 = Optional.ofNullable(obj.getName());
        System.out.println(optional3.orElse("Name is null"));

    }
}

class Employee{
    int id;
    String name;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }



}
