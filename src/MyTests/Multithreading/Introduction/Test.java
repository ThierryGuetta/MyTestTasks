package src.MyTests.Multithreading.Introduction;

public class Test {
    public static void main(String[] args) {

        myThread thread1 = new myThread();
        Thread thread2 = new Thread(new Runner());

        Thread thread3 = new Thread(new Runnable() { // by anon Runnable
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i + "Anon");
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Hello from main thread");
    }
}

class myThread extends Thread { //by Thread

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "Thread");
        }
    }
}

class Runner implements Runnable { //by Runnable
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "Runnable");
        }
    }
}
