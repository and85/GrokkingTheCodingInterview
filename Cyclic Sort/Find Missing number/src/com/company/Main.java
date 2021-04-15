package com.company;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = new int[] { 4, 0, 3, 1 };
        int m1 =  MissingNumber.findMissingNumber(nums1);

        int[] nums2 = new int[] { 8, 3, 5, 2, 4, 6, 0, 1 };
        int m2 =  MissingNumber.findMissingNumber(nums2);

        System.out.println(m1);
        System.out.println(m2);
    }
}

class MissingNumber {

    public static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i];

            if (j == nums.length) j -= 1;

            if (nums[i] != nums[j]) {
                if (i == nums.length - 2 && j == nums.length - 1) return;

                swap(nums, i, j);
            }
            else
                i++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findMissingNumber(int[] nums) {
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }

        return -1;
    }
}

