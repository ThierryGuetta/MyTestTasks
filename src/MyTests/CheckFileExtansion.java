package src.MyTests;

import java.util.Scanner;

public class CheckFileExtansion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        if (fileName.endsWith(".jpeg") || fileName.endsWith(".jpg")) {
            System.out.println("It's picture file");
        } else if (fileName.endsWith(".doc") || fileName.endsWith(".docx")) {
            System.out.println("It's word document file");
        } else if (fileName.endsWith(".htm") || fileName.endsWith(".html")) {
            System.out.println("It's HTML-page");
        } else if (fileName.endsWith(".mp3") || fileName.endsWith(".wav") || fileName.endsWith(".flac")) {
            System.out.println("It's music file");
        } else System.out.println("Non expected file extansion");
    }
}