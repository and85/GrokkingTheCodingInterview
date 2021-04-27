package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}));
        System.out.println(findMinSubArray(7, new int[]{2, 1, 5, 2, 8}));
        System.out.println(findMinSubArray(8, new int[]{3, 4, 1, 1, 6}));

        System.out.println("end");

    }

    public static int findMinSubArray(int S, int[] arr) {

        int windowSum = 0, minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
            // shrink the window as small as possible until the 'windowSum' is smaller than 'S'
            while (windowSum >= S) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }

        }

        return minLength;
    }
}
