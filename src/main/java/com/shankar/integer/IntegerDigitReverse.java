package com.shankar.integer;

import java.nio.ByteBuffer;

public class IntegerDigitReverse {

    public static void main(String ar[]){
        IntegerDigitReverse integerDigitReverse = new IntegerDigitReverse();
        System.out.println(integerDigitReverse.reverseInt(1534236469));
    }

    public int reverseInt(int x) {
        String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
}
