package dev.pal.preparation.arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[index+1] = arr[i+1];
                index++;
            }
        }
        int totalUnique = index+1;
        System.out.println("Total Unique elements : "+ totalUnique);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
