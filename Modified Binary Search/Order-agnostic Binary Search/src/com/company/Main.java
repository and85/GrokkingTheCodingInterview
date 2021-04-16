package com.company;

public class Main {

    public static int search(int[] arr, int key) {
        int left = 0, right = arr.length - 1, median;
        boolean ascOrder = arr[arr.length - 1] > arr[0];

        while (left < right) {
            median = left + (right - left) / 2;

            if (arr[median]  < key) {
                if (ascOrder)
                    left = median + 1;
                else
                    right = median - 1;
            }

            if (arr[median]  > key) {
                if (ascOrder)
                    right = median - 1;
                else
                    left = median + 1;
            }
        }

        if (arr[left] == key) return  left;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] { 4, 6, 10 }, 10));
        System.out.println(search(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
        System.out.println(search(new int[] { 10, 6, 4 }, 10));
        System.out.println(search(new int[] { 10, 6, 4 }, 4));
        System.out.println(search(new int[] { 10, 6, 4 }, 41));
    }
}
