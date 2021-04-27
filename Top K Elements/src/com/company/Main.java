package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static List<Integer> findKLargestNumbers(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        // Adding items to the pQueue using add()
        for (Integer n: nums) {
            pQueue.add(n);
        }

        for (int i = 0; i < k; i++)
            result.add(pQueue.poll());

        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = findKLargestNumbers(new int[] { 3, 1, 5, 12, 2, 11 }, 3);
        System.out.println("Here are the top K numbers: " + result);

        result = findKLargestNumbers(new int[] { 5, 12, 11, -1, 12 }, 3);
        System.out.println("Here are the top K numbers: " + result);
    }
}
