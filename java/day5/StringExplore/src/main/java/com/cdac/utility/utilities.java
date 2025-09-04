package com.cdac.utility;

import java.util.HashMap;
import java.util.Map;

public class utilities {
    public static boolean checkAnagram(String s1, String s2){
        int s1len = s1.length();
        int s2len = s2.length();
        char ch ;
        Map<Character, Integer> mp = new HashMap<>();
        if(s1len!=s2len) return false;

        for(int i = 0;i<s1len; i++ ){
            ch = s1.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for(char c : s1.toCharArray()){
            if(!mp.containsKey(c)) return false;
            mp.put(c,mp.get(c)-1);
            if(mp.get(c) == 0) mp.remove(c);
        }
        return mp.isEmpty();
    }
    public static int[] countULS(String str){
        char[] charArr = str.toCharArray();
        int cntUp=0,cntLow=0,cntSp=0;
//        for(char c: charArr){
//            if((int)c>64 && (int)c<91) cntUp++;
//            else if((int)c>96 && (int)c<123) cntLow++;
//            else if((int)c >31 && (int)c<127) cntSp++;
//        }

        for(int i=0; i<str.length();i++){
            if(str.codePointAt(i)>64 && str.codePointAt(i)<91) cntUp++;
            else if(str.codePointAt(i)>96 && str.codePointAt(i)<123) cntLow++;
            else if(str.codePointAt(i)>31 && str.codePointAt(i)<127) cntSp++;
        }
        int[] asciiArr = {cntUp,cntLow,cntSp};
        return asciiArr;
    }

}
