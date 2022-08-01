package com.code.codeWars;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static final Map<String, Integer> NUMBERS = new HashMap<>();

    public static void initMap() {
        NUMBERS.put("zero", 0);
        NUMBERS.put("ten", 10);
        NUMBERS.put("twenty", 20);
        NUMBERS.put("one", 1);
        NUMBERS.put("eleven", 11);
        NUMBERS.put("thirty", 30);
        NUMBERS.put("two", 2);
        NUMBERS.put("twelve", 12);
        NUMBERS.put("forty", 40);
        NUMBERS.put("three", 3);
        NUMBERS.put("thirteen", 13);
        NUMBERS.put("fifty", 50);
        NUMBERS.put("four", 4);
        NUMBERS.put("fourteen", 14);
        NUMBERS.put("sixty", 60);
        NUMBERS.put("five", 5);
        NUMBERS.put("fifteen", 15);
        NUMBERS.put("seventy", 70);
        NUMBERS.put("six", 6);
        NUMBERS.put("sixteen", 16);
        NUMBERS.put("eighty", 80);
        NUMBERS.put("seven", 7);
        NUMBERS.put("seventeen", 17);
        NUMBERS.put("ninety", 90);
        NUMBERS.put("eight", 8);
        NUMBERS.put("eighteen", 18);
        NUMBERS.put("nine", 9);
        NUMBERS.put("nineteen", 19);

    }

    public static int parseInt(String numStr) {
        initMap();
        int sum = 0;
        int thousands = 0;
        int hundreds = 0;
        int millions = 0;
        String[] numbers = numStr.split("[- ]");
        for (String number : numbers) {
            if (number.equals("millions") || number.equals("million")) {
                millions = sum * 1000000;
                sum = 0;
            } else if (number.equals("thousand")) {
                thousands = sum * 1000;
                sum = 0;
            } else if (thousands > 0 && number.equals("hundred")) {
                hundreds = sum * 100;
                sum = 0;
            } else if (number.equals("hundred")) {
                sum *= 100;
            } else {
                sum += NUMBERS.getOrDefault(number, 0);
            }
        }
        return millions + thousands + hundreds + sum;
    }
}
