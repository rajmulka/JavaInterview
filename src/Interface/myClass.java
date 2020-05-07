package Interface;

public class myClass implements InterfaceClass{

    //This class is created to implement the interface created in this Package

    public static void main(String[] args) {
        InterfaceClass obj = new myClass();
        obj.myMethod();
    }

    @Override
    public void myMethod(){

        System.out.println("I am Implementation of myMethod");
    }
}
