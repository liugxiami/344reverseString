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
	
     public static String reverseString(String s){
        if(s==null||s.length()==0)return s;
        String res="";
        while(s.length()!=0){
            res=s.charAt(0)+res;
            s=s.substring(1);
        }
        return res;
    }
    public static String reverseString1(String s){
        if(s==null||s.length()==0)return s;
        StringBuilder sb=new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
