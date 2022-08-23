package src.MyTests;

public class BinaryFlags {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(setFlag(20, 3)));
        System.out.println(Integer.toBinaryString(resetFlag(20, 3)));
    }

    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}

