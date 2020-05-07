package BasicProgrammingConcepts;

public class VariableTypes {
    static int myStatic = 50; // Static/Class Variable
    final int myFinalStatic = 60; // final keyword doesnt let user to change the value. Once it is assigned its final
    int myInstance = 100; // Instance Variable

    public static void main(String[] args) {
        int myLocal = 200; //Local Variable

        System.out.println("Value of the static variable is :" + myStatic);
        System.out.println("Value of the Local Variable is :"+ myLocal);

        //Inorder to access the instance variable we need to create an Object
        VariableTypes obj = new VariableTypes();
        System.out.println("Value of Instance variable is :"+ obj.myInstance);

        //So lets change the values of all the three variable types
        myLocal = 201;
        System.out.println("Value of the updated Local Variable is :"+ myLocal);

        obj.myInstance = 101;
        System.out.println("Value of the updated Instance variable is :"+ obj.myInstance);

        obj.myStatic= 51;
        System.out.println("Value of the updated Static variable is :"+ myStatic);

        /*obj.myFinalStatic=61;
        System.out.println("Value of the updated Final static variable is :"+ obj.myFinalStatic);*/


    }
}
