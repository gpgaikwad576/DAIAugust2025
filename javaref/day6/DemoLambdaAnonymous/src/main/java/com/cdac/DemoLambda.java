package com.cdac;
import java.util.List;
import java.util.ArrayList;
public class DemoLambda {
    public static int operateOnNumber(IFunction<Integer> func, int n){
        return func.apply(n);
    }

    public static List<Integer> operateOnNumbers(IFunction<Integer> func, List<Integer> n){
        List<Integer> mapped = new ArrayList<>();
        for(Integer i:n){
            mapped.add(func.apply(i));
        }
        return mapped;
    }

    public static void main(String[] args) {
        int j =10;
        String s = "java";
        List<Integer> nums = List.of(12,13,14,15);
        IFunction<Integer> square =(n)->n*n;
        System.out.println(square.apply(20));
        IFunction<Integer> factorial =(n)->{
            int facto =1;
            for(int i=1;i<=n;i++){
                facto*=i;
            }
            return facto;
        };
        System.out.println(factorial.apply(4));
        int tens = operateOnNumber((n)->n*10,14);

        int facto = operateOnNumber((n)->{
            int f=1;
            for(int i =1;i<=n;i++){
                f*=i;
            }
            return f;
        },14);
        System.out.println(facto);

        List<Integer> factos = operateOnNumbers((n)->{
            int f=1;
            for(int i=1;i<=n;i++){
                f*=i;
            }
            return f;
        },nums);
        System.out.println(factos);
    }
}