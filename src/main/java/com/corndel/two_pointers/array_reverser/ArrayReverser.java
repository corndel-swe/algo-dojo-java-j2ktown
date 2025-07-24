package com.corndel.two_pointers.array_reverser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReverser {
    public static int[] reverseBruteForce(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }



public static int[] reverseTwoPointers(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
