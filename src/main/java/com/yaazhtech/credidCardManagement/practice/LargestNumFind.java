
/* Algorithm
Step 1 : Start the program in initialize array with value.
step 2 : start function in largest().
step 3 : Using for loop to get the array data.
step 4 : Using MAX function to get the largest number and return the max value.
step 5 : run main function to print largest number.

 */
package com.yaazhtech.credidCardManagement.practice;

public class LargestNumFind {

    static int arr[] = {2,4,56, 3267784, 453,499,9808, 999, 1023};

    // Method to find maximum in arr[]
    static int largest()
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
    }
}
