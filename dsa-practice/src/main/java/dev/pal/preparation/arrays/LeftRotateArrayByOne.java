package dev.pal.preparation.arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 6};
        rotateArrayBF(arr);
    }

    private static void rotateArrayBF(int[] arr) {
        int[] dummyArray = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            dummyArray[i-1] = arr[i];
        }
        dummyArray[arr.length-1] = arr[0];

        for(int dummy: dummyArray) {
            System.out.println(dummy);
        }
    }
}
