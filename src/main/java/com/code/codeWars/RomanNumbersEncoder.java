package com.code.codeWars;

public class RomanNumbersEncoder {
    public String solution(int s) {
        int[] arabian = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder result = new StringBuilder();
        for (int i = arabian.length - 1; i >= 0; i--) {
            if (s - arabian[i] >= 0) {
                s -= arabian[i];
                result.append(roman[i]);
                i++;
            }
        }
        return String.valueOf(result);
    }

}
