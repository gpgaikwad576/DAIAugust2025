package com.cdac.utility;

public class myString {
    private String value;
    public myString(String value){
        this.value= value;
    }
    public boolean equals(String obj){

        if(obj==null ) return false;
        if(this.value == null) return obj ==null;

        if(obj.length() != this.value.length()) {
            return false;
        }
        int eqCnt =0;
        for(int i =0; i<this.value.length();i++){
            if(this.value.charAt(i) != obj.charAt(i)) return false;
        }
        return true;
    }

    public boolean equalsIgnoreCase(String obj){
        obj = obj.toUpperCase();
        value = value.toUpperCase();
        if(obj==null ) return false;
        if(this.value == null) return obj ==null;

        if(obj.length() != this.value.length()) {
            return false;
        }
        int eqCnt =0;
        for(int i =0; i<this.value.length();i++){
            if(this.value.charAt(i) != obj.charAt(i)) return false;
        }
        return true;
    }
}
