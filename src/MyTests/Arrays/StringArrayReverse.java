package src.MyTests.Arrays;

import java.util.Arrays;

public class StringArrayReverse {
    public static void main(String[] args) {
        String[] stringArray = {"Welcome", "To", "My", "GitHub", "Hello", "World"};
        for (int i = 0; i < stringArray.length/2; i++) {
            String tmp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - 1 - i];
            stringArray[stringArray.length - 1 - i] = tmp;
        }
        System.out.print(Arrays.toString(stringArray));
    }
}
