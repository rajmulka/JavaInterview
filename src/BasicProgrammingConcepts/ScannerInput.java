package BasicProgrammingConcepts;

import java.util.Scanner;

public class ScannerInput {
    /*There are 3 ways to read input from the User
    * Scanner Class
    * Buffered Reader Class
    * Console Class
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your Age?");
        int age = sc.nextInt();
        System.out.println("My age is :"+ age);
        System.out.println("Whats your name?");
        String name=sc.next();
        System.out.println("My Name is :"+ name);
        sc.close();
    }
}
