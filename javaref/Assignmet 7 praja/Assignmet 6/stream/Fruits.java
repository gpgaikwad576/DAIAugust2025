package day6.stream;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fruits {

    public static boolean isUpper(String word){
        if(word.charAt(0)-65<=26){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] fruits = {"MANGO", "Orange", "GRAPES", "banana", "strawberry", "Watermelon"};

        Stream<String> stream = Arrays.stream(fruits);

        System.out.println("------------------------List of upper case fruits----------------------");
        List<String> upper = stream.map((s -> s.toUpperCase())).collect(Collectors.toList());
        System.out.println(upper);
        System.out.println("------------------------List of lower case fruits----------------------");
        stream = Arrays.stream(fruits);
        List<String> lower = stream.map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lower);


        System.out.println("------------------------less than n ascending----------------------");
        stream = Arrays.stream(fruits);
        List<String> lessThanN = stream.filter(s->Character.getNumericValue(s.charAt(0))<='n').sorted(new UnicodeComparator()).collect(Collectors.toList());
        System.out.println(lessThanN);

        System.out.println("------------------------less than n descending----------------------");
        stream = Arrays.stream(fruits);
        List<String> lessThanNDesc = stream.filter(s->Character.getNumericValue(s.charAt(0))<='n').sorted(new UnicodeComparatorDesc()).collect(Collectors.toList());
        System.out.println(lessThanNDesc);



        System.out.println("------------------------List with upper name fruits----------------------");
        stream = Arrays.stream(fruits);
        List<String> isUpper = stream.filter(Fruits::isUpper).collect(Collectors.toList());
        System.out.println(isUpper);
        System.out.println("------------------------Less than 6----------------------");
        stream = Arrays.stream(fruits);
        List<String> lessThan6 = stream.sorted(new UnicodeComparator()).filter(s->s.length()<=6).sorted(new ReverseLenghtCompartor()).collect(Collectors.toList());
        System.out.println(lessThan6);

        System.out.println("-----------------------Lenght wise sorting----------------------");
        stream = Arrays.stream(fruits);
        Comparator<String> lenghtComapartor = (str1,str2)->{
         if(str1.length()>str1.length())
             return 1;
         else if (str1.length()==str2.length())
             return 0;
         return -1;
        };

        stream.sorted(lenghtComapartor).forEach(System.out::println);

    }
}
