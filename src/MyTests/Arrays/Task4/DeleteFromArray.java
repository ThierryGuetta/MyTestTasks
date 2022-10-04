package src.MyTests.Arrays.Task4;

import java.util.Arrays;

public class DeleteFromArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 2, 3, 0, 4, 2}; //delete 2
        System.out.println(Arrays.toString(DeleteNumFromArray(array, 2)));
    }

    public static int[] DeleteNumFromArray(int[] array, int x) {
        int length = 0;

        for (int i : array) {
            if (i == x) length++;
        }
        if (length == 0) return null;

        int[] result = new int[length];

        int index = 0;
        for (int j : array) {
            if (j != x) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }
}
