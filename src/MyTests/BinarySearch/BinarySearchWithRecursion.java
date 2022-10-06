package src.MyTests.BinarySearch;

import java.util.Arrays;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {

        int[] array = new int[100000000];
        int key = 99999999;

        arrayRandomFill(array);

        long time1 = System.currentTimeMillis();
        enumerationMethod(array, key);
        System.out.println("1 enumerationMethod time: " + (System.currentTimeMillis() - time1));

        long time2 = System.currentTimeMillis();
        binarySearchRecursion(array, key);
        System.out.println("2 binarySearch time: " + (System.currentTimeMillis() - time2));

    }

    public static int[] arrayRandomFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000000);
        }
        return array;
    }

    public static int enumerationMethod(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] array, int key) {
        return binarySearchRecursion(array, 0, array.length, key);
    }


    public static int binarySearchRecursion(int[] array, int start, int end, int key) {
        Arrays.sort(array);

        int mid = (start + end) / 2;

        if (key == array[mid]) return mid;
        else if (key < array[mid]) return binarySearchRecursion(array, 0, mid - 1, key);
        else if (key > array[mid]) return binarySearchRecursion(array, mid + 1, array.length - 1, key);
        else return -1;
    }
}
