package src.MyTests.Multithreading.Volatile;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        myThread myThread = new myThread();
        Scanner scanner = new Scanner(System.in);

        myThread.start();

        scanner.nextLine();
        myThread.shutdown();
    }
}

class myThread extends Thread {
    private volatile boolean work = true;
    int i = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (work) {
            System.out.println(i++ + "A");
        }
    }

    public void shutdown() {
        work = false;
    }
}
