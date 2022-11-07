package src.MyTests.Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            es.submit(new Worker(i));
        }
        es.shutdown();
        System.out.println("Приступаю к работе");
        es.awaitTermination(35000, TimeUnit.MILLISECONDS);
        System.out.println("Вся работа сделана");
    }
}

class Worker implements Runnable {
    int id;

    Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Делаю задание " + id);
    }
}
