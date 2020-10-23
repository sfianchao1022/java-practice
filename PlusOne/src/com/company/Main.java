package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution sol=new Solution();
        int[] dig = {9,8,9,9,9};
        int[] result = sol.plusOne(dig);
        String ans="";

        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
            ans += result[i];
        }

        System.out.println("The array represent the integer :" + ans);
    }
}
