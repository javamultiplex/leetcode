package com.javamultiplex.march;

import java.util.*;

/**
 * @author Rohit Agarwal on 14/03/21 3:19 pm
 * @copyright www.javamultiplex.com
 */
public class BinaryCodesValidator {

    //Time - O(n*2^k), Space - O(2^k)
    public static boolean method1(String s, int k) {
        List<String> binaryCodes = binaryCodes(k);
        for (String binaryCode : binaryCodes) {
            if (!s.contains(binaryCode)) {
                return false;
            }
        }
        return true;
    }


    //Time - O((n-k)*k), Space - O(2^k)
    public static boolean method2(String s, int k) {
        int size = (int) Math.pow(2, k);
        int length = s.length();
        Set<String> binaryCodes = new HashSet<>();
        for (int i = 0; i <= length - k; i++) {
            binaryCodes.add(s.substring(i, i + k));
        }
        return binaryCodes.size() == size;
    }

    private static List<String> binaryCodes(int size) {
        if (size == 1) {
            return Arrays.asList("0", "1");
        } else {
            List<String> output = new ArrayList<>();
            List<String> binaryCodes = binaryCodes(--size);
            for (String binaryCode : binaryCodes) {
                output.add("0" + binaryCode);
            }
            for (String binaryCode : binaryCodes) {
                output.add("1" + binaryCode);
            }
            return output;
        }
    }
}
