package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> result = Subsets.findSubsets(new int[] { 1, 3 });
        System.out.println("Here is the list of subsets: " + result);

        result = Subsets.findSubsets(new int[] { 1, 5, 3 });
        System.out.println("Here is the list of subsets: " + result);
    }
}

class Subsets {

    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int n: nums) {
            subsets = GenerateSubsets(subsets, n);
        }

        return subsets;
    }

    private static List<List<Integer>> GenerateSubsets(List<List<Integer>> subsets, int n) {
        List<List<Integer>> newSubsets = new ArrayList<>(subsets);

        for (List<Integer> s: subsets) {
            List<Integer> newSubset = new ArrayList<>(s);
            newSubset.add(n);

            newSubsets.add(newSubset);
        }

        return newSubsets;
    }
}
