package ImportantInterviewPrograms;

/*
* ArrayList: Array List is implementation of List interface
* Array List size grows dynamically when we add more and more elements
* Array: Array is fixed in size but comparatively faster;
* Array can be multi-dimensional like 2D and 3D arrays
*
* In the below program, lets see how we can convert array to array list and vice-versa
*
* Exercise: unAssignedCodes = allCodes - assignedCodes
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        String[] allCodes = {"001","002","003","004","005","006","007","008","009"};
        String[] assignedCodes = {"003","004"};

        String[] unAssignedCodes = getUnAssignedCodes(allCodes,assignedCodes);
        System.out.println(Arrays.toString(unAssignedCodes));
    }

    static String[] getUnAssignedCodes(String[] allCodes, String[] assignedCodes){

        //To Convert Array to Array List
        List<String> list1 =new ArrayList<String>(Arrays.asList(allCodes));
        List<String> list2 = new ArrayList<String>(Arrays.asList(assignedCodes));

        list1.removeAll(list2);
        // To Convert Array List to Array
        return list1.toArray(new String[list1.size()]);
    }

}
