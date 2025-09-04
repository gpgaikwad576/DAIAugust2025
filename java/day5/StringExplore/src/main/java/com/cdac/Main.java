package com.cdac;
import java.util.Scanner;
import com.cdac.utility.utilities;
import com.cdac.utility.myString;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i;
//        a. Check if two Strings are anagram
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first string");
        String s1 = sc.nextLine();
        System.out.println("Input second string");
        String s2 = sc.nextLine();
        System.out.println("Are two strings Anagram?:"+ utilities.checkAnagram(s1,s2));
//        b. Count no of uppercase/lowercase/special char in a String
        int[] countULS = utilities.countULS(s1);
        System.out.println("Count of Uppercase. Lowercase, Special chars in string1 is respectively: "+countULS[0]+" "+countULS[1]+" "+countULS[2]);
//        c. Check if String is upper case
        if(countULS[0]==s1.length()){
            System.out.println("String1 is Upper case");
        }
        else{
            System.out.println("String1 is not a Upper case");
        }


//        d. Shift characters of the String to left
        StringBuffer sb = new StringBuffer(s1);
        char fc = sb.charAt(0);
        for(i =0;i<sb.length()-1;i++){
            sb.setCharAt(i,sb.charAt(i+1));
        }
        sb.setCharAt(i,fc);
        System.out.println("left shifted string:"+sb);

//        e. Implement equals and equalsIngoreCase methods
        myString ms = new myString(s1);
        System.out.println("Invocation of equals and equalsIngoreCase methods, respectively: "+ms.equals(s2)+" "+ms.equalsIgnoreCase(s2));

    }
}