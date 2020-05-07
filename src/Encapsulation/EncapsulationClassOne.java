package Encapsulation;

public class EncapsulationClassOne {

    //Lets make the below variables private so they cannot be accessed by other classes.
    //These private variables can be accessed by only public methods of this class EncapsulationClassOne
    private int age;
    private String name;

    // Inorder to access the above private variables, we have to create Getter and Setter methods

    //Getter method to access private variable
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    //Setter method to access private variable
    public void setAge(int inputAge){
        age = inputAge;

    }

    public void setName(String inputName){
        name = inputName;
    }

}
