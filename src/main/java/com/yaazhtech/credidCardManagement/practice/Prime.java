
/* Algorithm

Step 1 : Initialize num variable and set the value
step 2 : Initialize flag variable and set the default value false
step 3 : Using for loop to initialize i value divide by 2
step 4 : If condition check num value moduler i value equal to 0 set the flag value as true
step 5 : break the loop.
step 6 : where flag is not true print as its prime number
step 7 : Else it's not a prime number
step 8 : Exit the program.
 */
package com.yaazhtech.credidCardManagement.practice;

public class Prime {
        public static void main(String args[]){
            int num = 2;
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }

}
