package day6.Predicate;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Number {


    public static List<Integer> operateOnNumber(Predicate<Integer> predicate, List<Integer> nums){
        List<Integer>  arrNum = new ArrayList<>();
        for(int num : nums){
            if(predicate.test(num))
                arrNum.add(num);
        }
        return  arrNum;
    }

    public static boolean isPrime2(int n){
        for(int i = 2 ; i <=n/2 ;i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isDivisible(int n){
        if( n%2==0 || n%3 == 0 || n%5 == 0 ){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Predicate<Integer> isPositive = (n) -> n>0;
        Predicate<Integer> isPrime = (n) -> {

            for(int i = 2 ; i <=n/2 ;i++){
                if(n % i == 0)
                    return false;
            }
            return true;
        };


        System.out.print("input : ");
        int num = sc.nextInt();
        System.out.println("------------------------Is Positive----------------------");
        System.out.println("Input is positive : " + isPositive.test(num));

        System.out.println("------------------------Is prime----------------------");
        System.out.println(isPrime.test(num));

        System.out.println("------------------------Is prime by method ref----------------------");
        Predicate<Integer> isPrime2 = Number::isPrime2;
        System.out.println(isPrime2.test(num));


        List<Integer> list = List.of(2,7,1,4,8,10,9);
        System.out.println(list);
        System.out.println("------------------------Even List----------------------");
        List<Integer> list1 = operateOnNumber((n)->(n%2==0),list);
        System.out.println(list1);

        System.out.println("-----------------------Divisible by 2,3 and 5----------------------");
        List<Integer> list2 = operateOnNumber(Number::isDivisible,list);
        System.out.println(list2);


    }
}
