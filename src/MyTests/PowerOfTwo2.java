package src.MyTests;
import java.util.Scanner;

public class PowerOfTwo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getPowerOfTwo(scanner.nextInt()));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2 << (power - 1);
        return result;
    }
}
