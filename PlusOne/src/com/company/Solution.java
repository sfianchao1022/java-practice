package com.company;

public class Solution {
    public int[] plusOne(int[] digits) {

        int last_digits = digits[digits.length - 1];
        int[] new_digits = new int[digits.length];
        int[] new_digits_four = new int[digits.length + 1];
        int i = digits.length - 1;
        boolean carry_bit = false;

        if (++last_digits > 9){
            carry_bit = true;
        }
        else {
            digits[digits.length - 1]++;
            new_digits = digits;
        }

        while (i>=0 && carry_bit == true){

            digits[i]++;

            if (digits[i] < 10){
                carry_bit = false;
                break;
            }

            digits[i] -= 10;

            i--;
        }

        if (carry_bit == true){
            new_digits_four[0] = 1;
            for (int j=0;j<digits.length;j++){
                new_digits_four[j+1] = digits[j];
            }
            return new_digits_four;
        }
        else {
            new_digits = digits;
            return new_digits;
        }



    }
}
