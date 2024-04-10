package com.yaazhtech.credidCardManagement.practice;

class Books extends Thread{
    public void run(){
        for (int DbUpdate=0;DbUpdate<5;DbUpdate++){
            System.out.println("Updating the database");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Num{
    void print(){
        for(int numbers=0;numbers<5;numbers++){
            System.out.println(numbers);
        }
    }
}

public class MultiTherading {
    public static void main (String[] args){
        Books book = new Books();
        Num num = new Num();
        book.start();
        num.print();
    }
}
