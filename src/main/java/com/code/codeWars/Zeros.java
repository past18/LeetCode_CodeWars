package com.code.codeWars;

public class Zeros {
    public static int zeros(int n) {
        int count = 0;
        while (n >= 5) {
            n = n / 5;
            count += n;
        }
        return count;
    }
}
