package dev.pal.preparation.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        findSecondLargestElement(arr);
        findSecondSmallElement(arr);
    }

    private static void findSecondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }

    private static void findSecondSmallElement(int[] arr) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if(arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        System.out.println("Second Small:" + secondSmall);
    }
}
