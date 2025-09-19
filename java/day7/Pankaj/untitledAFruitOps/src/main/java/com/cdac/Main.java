package com.cdac;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

/** numCharDesc::compare, ony if compare is static
    Only object or MR can be passed
 **/
class NumCharCalc implements Comparator<String> {
    public int compare(String s1,String s2){
        return Character.getNumericValue(s1.charAt(0))-Character.getNumericValue(s2.charAt(0));
    }
}


class areUpperCase implements Predicate<String>{
    public boolean test(String s1){
        return Character.isUpperCase(s1.charAt(0));
    }
}

class areUpperCase2{
    public static boolean test(String s1){
        return Character.isUpperCase(s1.charAt(0));
    }
}

public class Main {
    public static void main(String[] args) {
        //for a list of fruits: {"Mango", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon"};
        String[] fruits = {"MANGO", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon"};
        Stream<String> stream = Arrays.stream(fruits);
        //Create list of fruits in Uppercase and lowercase
        List<String> upper = stream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);



        Predicate<String> prediNDesc= new Predicate<>(){
            public boolean test(String s){
                return Character.getNumericValue(s.charAt(0))-Character.getNumericValue('n')<=0;

            }
        };

        Predicate<String> areAllUpperCase = (String s1)->{
            return s1.equals(s1.toUpperCase());
        };

        //cant create non interface type lambda
        Function<String,String> helloWorld =(String s1)->{
            int a=6,b=0;
            a=a+b;
            return s1;
        };



        stream = Arrays.stream(fruits);
        List<String> lower = stream.map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println(lower);

        //Create a list of fruits less than "n" in ascending order
        stream = Arrays.stream(fruits);
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.naturalOrder()).toList();
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted((s1,s2)->s1.compareTo(s2)).toList();
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.comparing(String::valueOf)).toList();
        List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.comparing(String::valueOf)).toList();
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted((s1,s2)->(Character.getNumericValue(s1.charAt(0))-Character.getNumericValue(s2.charAt(0)))).toList();
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(new NumCharCalc()).toList();
        System.out.println(lessThanN);
        System.out.println();

        //Create a list of fruits less than "n" in descending order
        stream = Arrays.stream(fruits);
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.reverseOrder()).toList();
        //List<String> lessThanN = stream.filter(s->Character.toLowerCase(s.charAt(0))<'n').sorted(Comparator.reverseOrder()).toList();
        stream.filter(prediNDesc).sorted(new NumCharCalcDesc()).forEach(s->System.out.print(s+ " "));
        System.out.println();


        //Create a list of fruits with uppercase names
        stream = Arrays.stream(fruits);
        //List<String> listUpper = stream.filter(new areUpperCase()).collect(Collectors.toList());
        List<String> listUpper = stream.filter(areUpperCase2::test).collect(Collectors.toList());
        System.out.println(listUpper);

        stream = Arrays.stream(fruits);
        stream.filter(areAllUpperCase).forEach(System.out::println);

        //Create a list of fruits with 6 alphabets or less in descending order
        stream = Arrays.stream(fruits);
        //stream.filter((String s1)->{return s1.length()<=6;}).sorted((String s1,String s2)->{return s2.compareTo(s1);}).forEach(s->System.out.print(s+' '));
        //stream.filter((String s1)->{return s1.length()<=6;}).sorted((String s1,String s2)->{return s2.compareTo(s1);}).forEach(s->System.out.print(s+' '));
        //stream.filter((String s1)->{return s1.length()<=6;}).sorted(Comparator.naturalOrder()).forEach(s->System.out.print(s+' '));
        //stream.filter((String s1)->{return s1.length()<=6;}).sorted((String s1,String s2)->{return s2.compareTo(s1);}).sorted(String::compareTo).forEach(s->System.out.print(s+' '));
        //stream.filter((String s1)->{return s1.length()<=6;}).sorted((String s1,String s2)->{return s2.compareTo(s1);}).sorted(String.CASE_INSENSITIVE_ORDER).forEach(s->System.out.print(s+' '));
        //stream.filter((String s1)->{return s1.length()<=6;}).sorted((String s1,String s2)->{return s2.compareTo(s1);}).sorted(String::compareToIgnoreCase).forEach(s->System.out.print(s+' '));
        //stream.filter((String s1)->{return s1.length()<=6;}).sorted((String s1,String s2)->{return s2.compareTo(s1);}).sorted(Comparator.comparingInt(String::length)).forEach(s->System.out.print(s+' '));
        stream.filter((String s1)->{return s1.length()<=6;}).sorted((String s1,String s2)->{return s2.compareTo(s1);}).sorted((s1,s2)->Integer.compare(s2.length(),s1.length())).forEach(s->System.out.print(s+' '));
        System.out.println();

        //Sort the fruits length-wise
        stream = Arrays.stream(fruits);
        stream.sorted(Comparator.comparing(String::length,Comparator.reverseOrder()).thenComparing(String::compareTo).reversed()).forEach((s)->System.out.print(s+" "));

    }
}