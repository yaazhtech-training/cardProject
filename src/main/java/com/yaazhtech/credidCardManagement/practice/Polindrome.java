/*
Algorithm
Step 1: To scan and get the input number
stem 2: create 3 variable like number, check and temp then assign number variable to the input value
step 3:  implement the logic -->whether the value until 0 using while loop
            temp = number % 10          --> 131%10 = 1  --> 13%10 = 1 --> 1%10 = 1
            check = (check * 10) + temp;-->(0*10)+1 = 1 --> 13*10+1= 131 --> 13*10+1=131
            number = number / 10;       --> 131/10 =13  --> 13/10 = 1  --> 1/10=0
step 4 : add if condition and check the input value and check both are same if its same print some text
            if not same print some message.
stem 5 : Exit the program

 */
package com.yaazhtech.credidCardManagement.practice;

import java.util.Scanner;

public class Polindrome {
    public static void main(String args[]){
        System.out.println("Enter the number to check :");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int original = number;
        int check =0;
        int temp;
        while(number>0) {
            temp = number % 10;
            check = (check * 10) + temp;
            number = number / 10;
        }
            if (original == check)
            {
                System.out.println("It's palindrome number");
            }
            else
            {
                System.out.println("It's not a palindrome number");
            }
    }
}
