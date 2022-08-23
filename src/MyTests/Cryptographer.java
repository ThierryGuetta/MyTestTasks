package src.MyTests;

import java.util.Arrays;

public class Cryptographer {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 7, 4, 1, 2, 3, 5, 12};
        int password = 1997;
        int[] cryptedArray = crypt(array, password);
        System.out.println(Arrays.toString(cryptedArray));
        int[] decryptedArray = crypt(cryptedArray, password);
        System.out.println(Arrays.toString(decryptedArray));
    }

    public static int[] crypt(int[] array, int password) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i] ^ password;
        }
        return result;
    }
}
