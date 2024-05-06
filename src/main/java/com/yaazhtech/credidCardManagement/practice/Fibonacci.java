/* Algorithm
fabonacci series program using if condition and for loop.
Step 1 : To initialize the variable n
step 2 : Check if condition until n <=1 and return the N
step 3 : Recursive call for the n value.
step 4 : Main function initialize the n value using for loop
step 5 : stop the program
*/
package com.yaazhtech.credidCardManagement.practice;

public class Fibonacci {
        // Function to print the fibonacci series
        static int fib(int n)
        {
            // Base Case
            if (n <= 1)
                return n;

            // Recursive call
            return fib(n - 1) + fib(n - 2);
        }
        public static void main(String args[])
        {
            // Given Number N
            int N = 10;

            // Print the first N numbers
            for (int i = 0; i < N; i++) {

                System.out.print(fib(i) + " ");
            }
        }
    }
