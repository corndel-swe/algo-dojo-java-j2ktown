package com.corndel.two_pointers.array_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFilter {

    public static int[] getDistinctNumbersBruteForce(int[] arr){
        if (arr == null || arr.length == 0) return new int[0];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result.add(arr[i]);
            }
        }

        result.add(arr[arr.length - 1]);
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] getDistinctNumbersTwoPointers(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        int[] copy = Arrays.copyOf(arr, arr.length);
        int write = 1;

        for (int read = 1; read < copy.length; read++) {
            if (copy[read] != copy[read - 1]) {
                copy[write] = copy[read];
                write++;
            }
        }

        return Arrays.copyOf(copy, write);
    }
}

