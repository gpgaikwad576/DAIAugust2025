package com.cdac;
import java.util.Comparator;
public class NumCharCalcDesc implements Comparator<String>{
    public int compare(String s1, String s2){
        return Character.getNumericValue(s2.charAt(0))-Character.getNumericValue(s1.charAt(0));
    }
}
