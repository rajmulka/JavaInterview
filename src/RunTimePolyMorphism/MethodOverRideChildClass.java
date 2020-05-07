package RunTimePolyMorphism;

public class MethodOverRideChildClass extends MethodOverRideParentClass{

    public void parentMethod(){
        System.out.println("I belong to Child Class"); // from here we are over riding method in Parent Class

    }

    public static void main(String[] args) {
        MethodOverRideParentClass obj = new MethodOverRideChildClass();
        obj.parentMethod();

        MethodOverRideParentClass obj1 = new MethodOverRideParentClass();
        obj1.parentMethod();
    }

}
