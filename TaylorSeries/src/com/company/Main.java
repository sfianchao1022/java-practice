package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1 + x + x^2/2! + x^3/3! + ...

        System.out.println(calculate(4,15));

        System.out.println(factorial(5));
    }

    public static double calculate(int e,int n){

        if(n==0){
            return 1;
        }
        else{
            return (Math.pow(e,n)/factorial(n))+calculate(e,n-1);

        }

    }

    public static double factorial(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }

    }

}
