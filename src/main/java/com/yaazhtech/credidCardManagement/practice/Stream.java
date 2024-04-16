package com.yaazhtech.credidCardManagement.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {


    public static void main(String args[]){
        //streaming example
        List<Integer> num= Arrays.asList(4,7,3,2,9,5);
        num.stream();
        num.forEach(n->System.out.println(n));

        //Filter method
       /* List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List result = names.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
        System.out.println(result);*/

        //sort
        /*List<Integer> num= Arrays.asList(4,7,3,2,9,5);
        List result = num.stream().sorted().collect(Collectors.toList());
        System.out.println(result);*/



    }
}
