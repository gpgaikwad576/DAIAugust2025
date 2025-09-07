package com.cdac;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class DemoLambdaGeneric {
    public static <T> List<T> operateOnData(Function<T,T> func,List<T> data){
        List<T> mapped = new ArrayList<>();
        for(T obj:data){
            mapped.add(func.apply(obj));
        }
        return mapped;
    }

    public static void main(String[] args) {
        Function<Integer,Integer> squares = (n)->n*n;
        Function<String,String> toUpper =(s)->s.toUpperCase();
        List<Integer> nums = List.of(12,13,14,15);
        List<String> names = List.of("Avani","Ajay","Aditi","Ayush");
        List<Integer> multiplyby5 = operateOnData((n)->n*5,nums);
        System.out.println(multiplyby5);
        List<String> namesUpper = operateOnData(String::toUpperCase,names);
        System.out.println(namesUpper);

    }
}
