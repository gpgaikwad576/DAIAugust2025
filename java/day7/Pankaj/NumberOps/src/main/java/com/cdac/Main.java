package com.cdac;
import java.util.function.Predicate;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static boolean checkPredicate(Predicate<Integer> predi,Integer n ){
        return predi.test(n);
    }

    public static List<Integer> operateOnNumbers(Predicate<Integer> predi,List<Integer> nums){
        List<Integer> rnums = new ArrayList<>();
        int numsi;
        for(int i =0;i<nums.size();i++){
            numsi = nums.get(i);
            if(predi.test(numsi)) rnums.add(numsi);
        }
        return rnums;
    }

    public static boolean isPrime(int n){
        for(int i=2;i<10;i++){
            if(n!=i && n%i==0) return false;
        }
        return true;
    }
    public static boolean isEven(int n){
        if(n%2 ==0) return true;
        return false;
    }

    public static boolean isDivisible(int n){
        if(n%2 ==0 && n%3 ==0 && n%5 ==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        1. Check if a number is a positive number
        Predicate<Integer> isPositive = (n)->n>0;
        isPositive.test(num);
//        2. Check if a number is prime number (use lambda expression as well as method ref)
            Predicate<Integer> isPrime = (n)->{
                for(int i=2;i<10;i++){
                    if(n!=i && n%i==0) return false;
                }
                return true;
            };
        System.out.println("Check if a number is prime number: Lambda: "+checkPredicate(isPrime,num));
        System.out.println("Check if a number is prime number: MR: "+checkPredicate(Main::isPrime,num));

//        3. Create a method operateOnNumbers(Predicate P,List<Integer>numbers)
//        Using the above method ->
//        a. print all even numbers
//        b. print all numbers which are divisible by 2,3 and 5
        List<Integer> nums= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,12,45,30,60,90));
        Predicate<Integer> isEven = (n)->{
            return n % 2 == 0;
        };

        Predicate<Integer> isDivisible = (n)-> {
            return n%2==0 && n%3==0 && n%5==0;
        };



        //3a print all even numbers
        System.out.println("print all even numbers: MR: "+operateOnNumbers(Main::isEven,nums));
        for(int num2 : nums){
            if(isEven.test(num2))
                System.out.print(num2+",");
        }
        System.out.println();
        //3b print all numbers which are divisible by 2,3 and 5
        System.out.println("print all numbers which are divisible by 2,3 and 5: MR: "+operateOnNumbers(Main::isDivisible,nums));
        for(int num2 : nums){
            if(isDivisible.test(num2))
                System.out.print(num2+",");
        }
    }
}