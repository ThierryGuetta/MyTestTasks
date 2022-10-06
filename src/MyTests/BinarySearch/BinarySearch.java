package src.MyTests.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100000000];

        arrayRandomFill(array);

        long time = System.currentTimeMillis();
        enumerationMethod(array, 15);
        System.out.println("1 enumerationMethod time: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        binarySearch(array, 0, 100000000, 15);
        System.out.println("2 binarySearch time: " + (System.currentTimeMillis() - time));

    }

    public static int[] arrayRandomFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000000);
        }
        return array;
    }

    public static int enumerationMethod(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int start, int end, int key) {
        Arrays.sort(array);

        end -= 1;
        int pos = -1;

        while (pos == -1 && start <= end) {
            int mid = (start + end) / 2;
            if (key == array[mid]) pos = mid;
            else if (key > array[mid]) start = mid + 1;
            else if (key < array[mid]) end = mid - 1;
            else return pos;
        }
        return pos;
    }
}
