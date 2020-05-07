package MultiLevelInheritance;

public class MultiLevelInheritanceTest {

    //Over here Class B extends to Class A;
    // Class C extends to Class B
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.methodForClassC();
        obj.methodForClassB();
        obj.methodForClassA();

    }
}
