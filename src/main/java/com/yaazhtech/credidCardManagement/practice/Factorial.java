/*
step 1. Start the program
step 2. Create one variable number and get the value from inut
step 3: Initialize fact variable and set the default size as 1
Step 4: Using for loop for(i=1;i<=number; i++)
Step 5: {fact=fact*i;} add the math logic to calculate the value
Step 6: Print the output System.out.println("Factorial of "+number+" is: "+fact);
Step 7: End the program
 */
package com.yaazhtech.credidCardManagement.practice;
import java.util.*;
public class Factorial {

        public static void main(String args[]){
            int i,fact=1;
            int number=3;//It is the number to calculate factorial
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }
}

