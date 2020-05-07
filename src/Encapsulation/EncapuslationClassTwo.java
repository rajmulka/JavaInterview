package Encapsulation;

public class EncapuslationClassTwo {

    public static void main(String[] args) {
        EncapsulationClassOne obj = new EncapsulationClassOne();
        obj.setAge(20);
        obj.setName("Rajashekhar");

        System.out.println("My name is :"+ obj.getName());
        System.out.println("My age  is :"+ obj.getAge());
    }
}
