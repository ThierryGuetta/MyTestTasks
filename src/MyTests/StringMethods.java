package src.MyTests;

import java.util.Arrays;

public class StringMethods {
    public static String text = "hi/hello/good day/good night/human";

    public static void main(String[] args) {
        System.out.println(stringFromArray());
        System.out.println(stringBySplitAndJoin());
        System.out.println(stringByReplace());
    }

    public static String stringFromArray() {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '/') array[i] = '\\';
        }
        return new String(array);
    }

    public static String stringBySplitAndJoin() {
        String[] array = text.split("/");
        return String.join("\\", array);
    }

    public static String stringByReplace() {
        return text.replace('/', '\\');
    }
}

