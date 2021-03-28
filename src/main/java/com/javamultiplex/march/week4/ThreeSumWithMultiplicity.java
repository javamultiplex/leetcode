package com.javamultiplex.march.week4;

/**
 * @author Rohit Agarwal on 23/03/21 11:13 pm
 * @copyright www.javamultiplex.com
 */
public class ThreeSumWithMultiplicity {
    public static int TEN_POWER_9_PLUS_7 = 1000000007;

    //Time - O(n^3), Space - O(1)
    public static int threeSumMulti(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count = (count + 1) % TEN_POWER_9_PLUS_7;
                    }
                }
            }
        }
        return count;
    }
}
