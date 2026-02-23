package dev.pal.preparation.arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //rotateArrayBF(arr);
        rotateArrayOptimal(arr);
    }

    private static void rotateArrayOptimal(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        for(int val : arr) {
            System.out.print(val+ " ");
        }
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
