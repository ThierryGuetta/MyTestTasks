package src.MyTests.Arrays.Task2;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        System.out.println("Before: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("After: " + Arrays.toString(array));
    }
}
