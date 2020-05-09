package BasicProgrammingConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

    /*There are 3 ways to read input from the User
     * Scanner Class
     * Buffered Reader Class
     * Console Class
     * */

    //BufferedReader class is used to read user from input
    public static void main(String[] args) throws IOException {
        //Instantiate BufferedReader Object
        BufferedReader obj =  new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Whats your Website name?");

        //To read data using readLine method
        String myWebsite = obj.readLine();

        //To Print the Website from reader input
        System.out.println("The Website name is :"+ myWebsite);
    }
}
