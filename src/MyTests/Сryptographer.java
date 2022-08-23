package src.MyTests;

import java.util.Arrays;

public class Ñryptographer {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int password = 1337;
        int[] cryptedArray = crypto(array, password);
        System.out.println(Arrays.toString(cryptedArray));
        int[] decryptedArray = crypto(cryptedArray, password);
        System.out.println(Arrays.toString(decryptedArray));

    }

    public static int[] crypto(int[] array, int password) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] ^ password;
        }
        return result;
    }
}
