package com.yaazhtech.credidCardManagement.practice;
public class FibonacciSeries {
public static void main(String args[]){
    int n = 15, firstTerm = 0, secondTerm = 1;

    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int number = 1; number < n; number++) {

        System.out.print(firstTerm + ", ");

        // compute the next term
        int nextTerm = firstTerm + secondTerm;  // 0+1 | 1+1
        firstTerm = secondTerm; //0=1  | 1=1
        secondTerm = nextTerm; //1=1 |1=2
    }
    }
}

