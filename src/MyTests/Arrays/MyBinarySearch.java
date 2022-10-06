package src.MyTests.Arrays;

import java.util.Scanner;

public class MyBinarySearch {
    public static void main(String[] args) {
        int[] array = {-29, -12, -5, 0, 3, 5, 7, 21, 23, 35, 54}; //11

        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int start = 0;
        int end = array.length - 1;
        int pos = -1;

        while (pos == -1 && start <= end) {
            int mid = (start + end) / 2;
            if (key == array[mid]) pos = mid;
            else if (key > array[mid]) start = mid + 1;
            else if (key < array[mid]) end = mid - 1;
            else System.out.println(pos);
        }
        System.out.println(pos);
    }
}
