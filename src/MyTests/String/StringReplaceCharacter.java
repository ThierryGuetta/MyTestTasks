package src.MyTests.String;
import java.util.Scanner;
public class StringReplaceCharacter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++)
            if (chars[i] == '/')
                chars[i] = '\\';

        String result = new String(chars);
        System.out.println(result);
    }
}
