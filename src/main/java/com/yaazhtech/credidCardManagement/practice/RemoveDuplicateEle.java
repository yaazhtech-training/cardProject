/*
Step 1 : initialize one array with values.
step 2 : traverse the value form 1 st 2nd and compare the values
step 3 : while comparing the first value is equal to second value it will skip and compare 2 value to 3rd
step 4 : print the array
 */
package com.yaazhtech.credidCardManagement.practice;

public class RemoveDuplicateEle {
    public static void main(String args[]) {
        int array[] = {1, 1, 2, 3,3, 4, 5, 5, 6, 7, 7, 8};
        int len = array.length;

        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (array[i] != array[i + 1]){
                array[j++] = array[i];
                }
        }
        array[j++] =array[len - 1];
        for(int k =0; k<j;k++){
            System.out.println(array[k]);
        }

    }
}
