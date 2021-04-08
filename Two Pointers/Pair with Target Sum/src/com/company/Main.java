package com.company;

public class Main {

    public static void main(String[] args) {
        PairWithTargetSum.search(new int[] {1, 2, 3, 4, 6}, 6 );
    }
}

class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {
        int start = 0;
        int end = arr.length - 1;
        int curSum = 0;

        while (start < end) {
            curSum = arr[start] + arr[end];
            if (curSum == targetSum)
                break;

            if (curSum > targetSum)
                end--;

            if (curSum < targetSum)
                start++;
        }

        return new int[] { start, end };
    }
}
