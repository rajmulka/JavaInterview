package ImportantInterviewPrograms;
/*
* Q: Given a string print the following
* a. Index/position of duplicate characters
* b. Total number of duplicate characters
* Example: hello world
* a. Index/position of duplicate characters:3,7,9
* b. Total number of duplicate characters: 3
* */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        String s = "hello world";

        //Convert String to Character array
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<Character>();

        int ctr=0;
        for(int i =0;i<charArray.length;i++){

            if(!set.add(charArray[i])){
                System.out.println("Index/position of duplicate characters :"+i);
                ctr++;

            }


        }
        System.out.println("Total number of duplicate characters :"+ ctr);
    }

}
