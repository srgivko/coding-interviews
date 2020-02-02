package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int size = 20;
        int[] ints = new int[size];
        int[] ints1 = {1, 2, 7, 8, 9, 10, 3, 5};
        for (int i = 0; i < size; i++) {
            ints[i] = i % 10;
        }
        quicksort(ints, 0, size - 1);
        System.out.println(Arrays.toString(ints));
        quicksort(ints1, 0, ints1.length - 1);
        System.out.println(Arrays.toString(ints1));
    }

    private static void quicksort(int[] ints, int low, int high) {
        int i = low;
        int j = high;
        int mid = ints[low + (high - low) / 2];
        while (i < j) {
            while (ints[i] < mid) i++;
            while (ints[j] > mid) j--;
            if (i <= j) {
                swap(ints, i, j);
                i++;
                j--;
            }
        }
        if (i < high) {
            quicksort(ints, i, high);
        }
        if (j > low) {
            quicksort(ints, low, j);
        }
    }

    private static void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }
}
