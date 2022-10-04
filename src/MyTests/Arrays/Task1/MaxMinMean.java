package src.MyTests.Arrays.Task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxMinMean {
    public static void main(String[] args) {

        double[] array = new double[10];
        ArrayFilling(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Max: " + Max(array));
        System.out.println("Min: " + Min(array));
        System.out.println("Mean: " + Mean(array));

    }

    public static void ArrayFilling(double[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random();
            }
        }
    }

    public static double Max(double[] array) {
        double max = Double.MIN_VALUE;
        if (array != null) {
            for (double v : array) {
                if (v > max) max = v;
            }
        }
        return max;
    }

    public static double Min(double[] array) {
        double min = Double.MAX_VALUE;
        if (array != null) {
            for (double v : array) {
                if (v < min) min = v;
            }
        }
        return min;
    }

    public static double Mean(double[] array) {
        Double sum = 0.0;
        if (array != null) {
            for (Double v : array) {
                sum += v;
            }
            return sum / array.length;
        } else return 0;
    }
}