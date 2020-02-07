package com.company;

public class Main {

    public final static int e=3;

    public static void main(String[] args) {
	// write your code here
        //x + x^2/2! + x^3/3! + ...
        
        //e=3;
        System.out.println(calculate(e));

        //System.out.println(hierarchy(5));
    }

    public static double calculate(int x){

        if(x==0){
            return 0;
        }
        else{
            //System.out.println(Math.pow(2,x));
            //System.out.println(hierarchy(x));
            //System.out.println(e);
            return (Math.pow(e,x)/(double)hierarchy(x))+calculate(x-1);

        }

    }

    public static int hierarchy(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*hierarchy(a-1);
        }

    }

}
