package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    String s="I like Java";
        System.out.println(reverseString(s));
    }
    //write a function that takes s string as input and returns the string reversed
    public static String reverseString(String s){
        if(s==null||s.length()==0) return s;
        int p=-1,q=s.length();
        char[] chars=s.toCharArray();
        while(++p<=--q){
            swap(chars,p,q);
        }
        return new String(chars);
    }

    public static void swap(char[] chars,int p,int q){
        char temp=chars[p];
        chars[p]=chars[q];
        chars[q]=temp;
    }
}
