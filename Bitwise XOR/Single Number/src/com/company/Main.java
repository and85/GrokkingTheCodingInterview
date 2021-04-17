package com.company;

public class Main {

    public static int findSingleNumber(int[] arr) {
        int res = 0;
        for (int x: arr)
            res ^= x;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(findSingleNumber(new int[]{1, 4, 2, 1, 3, 2, 3}));
    }
}
