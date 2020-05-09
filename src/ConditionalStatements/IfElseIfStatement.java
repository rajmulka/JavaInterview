package ConditionalStatements;

public class IfElseIfStatement {

    public static void main(String[] args) {
        int a = 60;
        if(a > 70){
            System.out.println("Value of a is :"+ a);
        }else if(a<=60){
            System.out.println("Value of a is :"+ a);
        }
        else{
            System.out.println("Both the above conditions failed");
        }

    }
}
