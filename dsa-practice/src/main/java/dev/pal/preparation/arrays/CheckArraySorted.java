package dev.pal.preparation.arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,8};
        boolean result = isArraySorted(arr);
        System.out.println("Array Sorted:" + result);
    }

    private static boolean isArraySorted(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return sorted;
    }
}
