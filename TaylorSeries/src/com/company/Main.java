package com.company;

public class Main {

    //public final static int e=3;

    public static void main(String[] args) {
	// write your code here
        //1 + x + x^2/2! + x^3/3! + ...

        //e=3;
        System.out.println(calculate(4,15));

        //System.out.println(hierarchy(5));
    }

    public static double calculate(int e,int n){

        if(n==0){
            return 1;
        }
        else{
            return (Math.pow(e,n)/hierarchy(n)+calculate(e,n-1));

        }

    }

    public static double hierarchy(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*hierarchy(a-1);
        }

    }

}
