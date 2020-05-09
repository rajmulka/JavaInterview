package BasicProgrammingConcepts;

public class Operators {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50;

        System.out.println("Addition: "+ (num1 + num2));
        System.out.println("Subtraction: "+ (num1 - num2));
        System.out.println("Multiplication: "+ (num1 - num2));
        System.out.println("Division: "+ (num1/num2));
        System.out.println("modulus: "+ (num1%num2));

        //increments and decrements
        num1++;
        System.out.println("Increment num1:"+ num1++);
        num2--;
        System.out.println("Decrement num2:"+ num2--);

        //num1 + num2
        num1 += num2; // this is equal to num1 = num1+num2
        System.out.println(num1);

        //num1-num2
        num1 -=num2;
        System.out.println(num1);

    }
}
