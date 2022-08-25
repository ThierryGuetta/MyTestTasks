package src.MyTests;

import java.util.Arrays;
import java.util.Scanner;

public class Cryptographer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Enter data to array (" + array.length + " numbers)");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter password: ");
        int password = scanner.nextInt();
        int[] encrypto = encrypto(array, password);
        int[] decrypto = decrypto(encrypto, password);
        System.out.println(Arrays.toString(encrypto));
        System.out.println(Arrays.toString(decrypto));
    }

    public static int[] encrypto(int[] array, int password) {
        int[] encrypto = new int[array.length];
        for (int i = 0; i < encrypto.length; i++) {
            encrypto[i] = array[i] ^ password;
        }
        return encrypto;
    }

    public static int[] decrypto(int[] encryptedArray, int password) {
        int[] decrypto = new int[encryptedArray.length];
        for (int i = 0; i < decrypto.length; i++) {
            decrypto[i] = encryptedArray[i] ^ password;
        }
        return decrypto;
    }
}
