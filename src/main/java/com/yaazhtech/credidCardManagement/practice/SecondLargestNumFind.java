/*
Algorithm

Step 1 : create one function called getSecondLargest()
step 2 : pass two params a, total
step 3 : sort the array
step 4 : return the array value minus 2 so array[5] will print
step 5 : now print array[5]
step 6 : run main function create one array with values.
step 7 : Print the function with passing params
step 8 : end the program
 */

package com.yaazhtech.credidCardManagement.practice;
import java.util.Arrays;

public class SecondLargestNumFind {
    public static int getSecondLargest(int[] a, int total){
        Arrays.sort(a);
        return a[total-2];
    }
    public static void main(String args[]){
        int a[]={1,2,5,6,3,2,7,8};

        System.out.println("Second Largest: "+getSecondLargest(a,8));

    }
}

