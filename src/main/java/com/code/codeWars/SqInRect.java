package com.code.codeWars;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        while (lng != 0 && wdth != 0) {
            if (lng > wdth) {
                list.add(wdth);
                lng = lng - wdth;
            } else if (lng < wdth) {
                list.add(lng);
                wdth = wdth - lng;
            } else if (lng == wdth) {
                list.add(wdth);
                lng = 0;
                wdth = 0;
            }
        }
        return list;
    }
}