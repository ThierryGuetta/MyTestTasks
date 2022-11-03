package src.MyTests.Multithreading.Introduction;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello World!");
        }
        Thread thread = new Thread();
        thread.run();
    }
}

class Thread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
