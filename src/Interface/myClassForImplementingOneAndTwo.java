package Interface;

public class myClassForImplementingOneAndTwo implements myInterfaceTwo{

    public static void main(String[] args) {
        myInterfaceTwo obj = new myClassForImplementingOneAndTwo();
        obj.myMethodTwo();
        obj.myMethodOne();

    }

    @Override
    public void myMethodOne(){
        System.out.println("I belong to MethodOne");
    }

    @Override
    public void myMethodTwo(){
        System.out.println("I belong to MethodTwo");
    }
}
