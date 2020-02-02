package Searching;

import java.util.Scanner;

public class BinarySearch {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = i + 1;
        }
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        System.out.println(binarySearch(array, 0, SIZE - 1, nextInt));
        System.out.println(binarySearch2(array, nextInt));
    }

    private static boolean binarySearch2(int[] array, int search) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right + 1) / 2;
            if (array[mid] > search) right = mid - 1;
            else if (array[mid] < search) left = mid + 1;
            else {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] array, int left, int right, int search) {
        if (left > right) return false;
        int mid = (left + right + 1) / 2;
        if (array[mid] < search) return binarySearch(array, mid + 1, right, search);
        else if (array[mid] > search) return binarySearch(array, left, mid - 1, search);
        else if (array[mid] == search)
            return true;
        return false;
    }


}
