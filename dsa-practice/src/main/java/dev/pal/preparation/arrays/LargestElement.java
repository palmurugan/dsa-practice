package dev.pal.preparation.arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 7, 9};
        findLargestElement(arr);
    }

    private static void findLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Element is : "+ max);
    }
}
