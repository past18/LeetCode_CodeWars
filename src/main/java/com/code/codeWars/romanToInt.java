package com.code.codeWars;

public class romanToInt {
    public static int romanToInt(String s) {
        char[] in = s.toCharArray();
        int count = 0;
        if (in.length > 1) {
            for (int i = 0; i < in.length; i++) {
                if (i < in.length - 1 && transliteration(in[i]) < transliteration(in[i + 1])) {
                    count += transliteration(in[i + 1]) - transliteration(in[i]);
                    i++;
                } else count += transliteration(in[i]);
            }
        } else return transliteration(in[0]);
        return count;
    }

    public static int transliteration(char c) {
        String s = String.valueOf(c);
        return switch (s) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }
}

