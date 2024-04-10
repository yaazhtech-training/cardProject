/* Algorithm
Step 1 : create and initialize string variable input
step 2 : use getBytes() method to convert string so now the input string convert into reverse
step 3 : store the reverse string into the result byte
step 4 : Using for loop to check whether the length is 0.
step 5 : print the result value. Value would be in reverse now.
 */

package com.yaazhtech.credidCardManagement.practice;
public class StringReverseForLoop {
        public static void main(String[] args)
        {
            String input = "One";
            byte[] strAsByteArray = input.getBytes();
            byte[] result = new byte[strAsByteArray.length];
            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];

            System.out.println(new String(result));
        }
    }
