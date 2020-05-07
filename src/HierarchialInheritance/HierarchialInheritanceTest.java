package HierarchialInheritance;

public class HierarchialInheritanceTest {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.methodOneClassA();
        obj.methodOfClassC();
        //We cant call method from Class B, as there is no connection between Class B and Class C
    }
}
