package com.javamultiplex.march.week2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 12/03/21 10:45 pm
 * @copyright www.javamultiplex.com
 */

//Integer to Roman
public class IntegerToRoman {

    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "");
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }

    public static String intToRoman(int num) {
        if (map.containsKey(num)) {
            return map.get(num);
        } else {
            int baseNumber = getBaseNumber(num);
            StringBuilder romanNumber = new StringBuilder();
            int quotient = num / baseNumber;
            int remainder = num % baseNumber;
            while (quotient != 0) {
                romanNumber.append(map.get(baseNumber));
                quotient--;
            }
            return romanNumber.append(intToRoman(remainder)).toString();
        }
    }

    private static int getBaseNumber(int num) {
        int baseNumber;
        if (num > 10 && num < 40) {
            baseNumber = 10;
        } else if (num > 40 && num < 50) {
            baseNumber = 40;
        } else if (num > 50 && num < 90) {
            baseNumber = 50;
        } else if (num > 90 && num < 100) {
            baseNumber = 90;
        } else if (num > 100 && num < 400) {
            baseNumber = 100;
        } else if (num > 400 && num < 500) {
            baseNumber = 400;
        } else if (num > 500 && num < 900) {
            baseNumber = 500;
        } else if (num > 900 && num < 1000) {
            baseNumber = 900;
        } else {
            baseNumber = 1000;
        }
        return baseNumber;
    }
}
