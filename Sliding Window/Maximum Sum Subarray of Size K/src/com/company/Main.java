package com.company;

public class Main {

    public static void main(String[] args) {
        int res = MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 });
        System.out.println(res);
    }
}

class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray(int k, int[] arr) {

        int curSum = 0, maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (i >= k) {
                curSum -= arr[i - k];
            }

            if (curSum > maxSum)
                maxSum = curSum;
        }

        return maxSum;
    }
}
