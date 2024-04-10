/* Algorthim :
Step 1 : Create main class Reverse.
step 2 : Create one main method for program execution.
step 3 : initialize string variable adn set some values for that variable
step 4 : String class does not have reverse() method, we need to convert the input string to
         StringBuffer, which is achieved by using the reverse method  of StringBuffer.
step 5 : reverse string builder for our input.
step 6 : print the input variable.*/

package com.yaazhtech.credidCardManagement.practice;
public class StringReverse {
    public static void main(String[] args)
    {
        String reverseWord = "one";

        // conversion from String object to StringBuffer
        StringBuffer conversion = new StringBuffer(reverseWord);

        // reverse StringBuilder input1
        conversion.reverse();

        // print reversed String
        System.out.println(conversion);
    }
}
