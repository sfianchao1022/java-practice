package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(1100));

        int a=121;
        System.out.println(a);

    }

//wrong answer, think too much
    public static boolean Palindrome(int x) {

        String string=Integer.toString(x);

        if(x<0){
            return false;
        }else if(string.length()%2==0){
            string=string.substring(0,string.length()/2).concat("m")+string.substring(string.length()/2);

        }else{

        }

        String a="";
        String b="";
        int flag=0;
        boolean bool=false;

        for(int j=string.length()-1;j>=string.length()/2;j--){
            b=string.substring(j,j+1);
            System.out.println(b+" ");

            for(int i=0;i<string.length();i++){
                a=string.substring(i,i+1);
                //String a=string.substring(i,i+1);
                System.out.println(a+" ");
                if(a.equals(b)){
                    System.out.println("equal");
                    flag++;
                    break;
                }

            }

        }

        if(flag==string.length()/2+1){
            bool=true;
            System.out.println(bool);
            System.out.println(flag);
        }

        return bool;
//        for(int i=0;i<string.length();i++){
//            String t=string.substring(i,i+1);
//            //String a=string.substring(i,i+1);
//            System.out.println(t+" ");
//        }


    }

    public static boolean isPalindrome(int x){

        String string=Integer.toString(x);

        if(x<0){
            return false;
        }
        //String[] arr=new String[string.length()];
        String b="";
        String a="";

        for(int j=string.length()-1;j>=0;j--){
            b+=string.substring(j,j+1);
            System.out.println(b+" ");
        }

        for(int i=0;i<string.length();i++){
            a+=string.substring(i,i+1);
            //String a=string.substring(i,i+1);
            System.out.println(a+" ");


        }

        if(a.equals(b)){
            return true;
        }else{
            return false;
        }

    }

}
