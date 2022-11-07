package src.MyTests.Multithreading.Synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    Random rnd = new Random();

    public static void main(String[] args) {
        new Test2().main();
    }

    public void main() {
        Thread myThread = new Thread(this::doWork);
        Thread myThread2 = new Thread(this::doWork);

        long start = System.currentTimeMillis();

        myThread.start();
        myThread2.start();
        try {
            myThread.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();

        System.out.println("Run time: " + (end - start) + " ms");
        System.out.println(list1.size());
        System.out.println(list2.size());

    }

    public void addToList1() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list1.add(rnd.nextInt(100));
    }

    public void addToList2() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list2.add(rnd.nextInt(100));
    }

    public void doWork() {
        for (int i = 0; i < 1000; i++) {
            synchronized (list1) {
                addToList1();
            }
            synchronized (list2) {
                addToList2();
            }
        }
    }
}