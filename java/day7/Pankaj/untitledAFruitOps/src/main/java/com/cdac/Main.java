package com.cdac;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        for a list of fruits: {"Mango", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon"};
        String[] fruits = {"MANGO", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon"};
        Stream<String> stream = Arrays.stream(fruits);
//        Create list of fruits in Uppercase and lowercase
        List<String> upper = stream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);

        stream = Arrays.stream(fruits);
        List<String> lower = stream.map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println(lower);
//        Create a list of fruits less than "n" in ascending order
        stream = Arrays.stream(fruits);
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.naturalOrder()).toList();
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted((s1,s2)->s1.compareTo(s2)).toList();
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.comparing(String::valueOf)).toList();
        //System.out.println(lessThanN);



//        Create a list of fruits less than "n" in descending order
        Predicate<String> prediNDesc= new Predicate<>(){
            public boolean test(String c1){
                return Character.getNumericValue(s1.get(0))-Character.getNumericValue('n');

            }
        };
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.reverseOrder()).toList();
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.reverseOrder()).toList();
        stream.filter(prediNDesc).sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);
        System.out.println();
        System.out.println();


//        Create a list of fruits with uppercase names

//        Create a list of fruits with 6 alphabets or less in descending order
//        Sort the fruits length-wise


    }
}