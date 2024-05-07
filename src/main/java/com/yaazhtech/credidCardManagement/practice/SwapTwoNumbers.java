/* Algorithm
STEP 1: Get input x and y  values using input scanner.
STEP 2: PRINT x, y values
STEP 3: x = x + y  y
STEP 4: y= x - y
STEP 5: x =x - y
STEP 6: PRINT x, y
STEP 7: End the program
 */

package com.yaazhtech.credidCardManagement.practice;
import java.util.*;
public class SwapTwoNumbers {
        public static void main(String a[])
        {
            System.out.println("Enter the value of x and y");
            Scanner sc = new Scanner(System.in);
            /*Define variables*/
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("before swapping numbers: "+x +" "+ y);
            /*Swapping*/
            x = x + y;  // 4 + 2 = 6
            y = x - y;  // 6 -2 = 4
            x = x - y;  // 6 -4 = 2
            System.out.println("After swapping: "+x +"  " + y);
        }
    }
