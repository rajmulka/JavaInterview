package BasicProgrammingConcepts;

public class ConsoleClass {
    /*There are 3 ways to read input from the User
     * Scanner Class
     * Buffered Reader Class
     * Console Class
     * */
    public static void main(String[] args) {
        //Using console to input data from user
        String mySite = System.console().readLine();
        System.out.println(mySite);
    }
}
