package com.code.codeWars;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int ns = 0;
        int we = 0;
        for (char c : walk) {
            if (c == 'n') {
                ns += 1;
            } else if (c == 's') {
                ns -= 1;
            } else if (c == 'w') {
                we += 1;
            } else if (c == 'e') {
                we -= 1;
            }
        }
        return ns == 0 && we == 0;
    }
}
