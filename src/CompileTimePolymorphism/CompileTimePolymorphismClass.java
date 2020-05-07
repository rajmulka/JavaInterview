package CompileTimePolymorphism;

public class CompileTimePolymorphismClass {

    //Method Names are same and we will pass different parameters
     void myMethod(int a){
         System.out.println("Value of a is :"+ a);

     }

     void myMethod(int a, int b){
         System.out.println("Values of a is :"+ a + "Value of b is :"+ b);

     }

     void myMethod(String name){
         System.out.println("Name of the Variable is :"+ name);

     }
    // create an Object in Main method and call all the above methods
    public static void main(String[] args) {
        CompileTimePolymorphismClass obj = new CompileTimePolymorphismClass();
        obj.myMethod(10);
        obj.myMethod(10,20);
        obj.myMethod("Rajashekhar Mulka");
    }

}
